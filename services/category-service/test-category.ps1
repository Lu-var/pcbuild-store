param(
    [string]$BaseUrl = "http://localhost:8084",
    [switch]$StartService
)

$pass = 0
$fail = 0

function Test-Endpoint {
    param($Name, $Method = "GET", $Url, $Body, $Expected, $ContentType = "application/json")
    try {
        if ($Body) {
            $r = Invoke-WebRequest -Uri $Url -Method $Method -Body $Body -ContentType $ContentType -UseBasicParsing -ErrorAction Stop
        } else {
            $r = Invoke-WebRequest -Uri $Url -Method $Method -UseBasicParsing -ErrorAction Stop
        }
        $actual = $r.StatusCode
        if ($actual -eq $Expected) {
            Write-Host "  `u{2705} $Name" -ForegroundColor Green
            $script:pass++
        } else {
            Write-Host "  `u{274C} $Name (got $actual, expected $Expected)" -ForegroundColor Red
            $script:fail++
        }
    } catch {
        $actual = $_.Exception.Response.StatusCode.value__
        if ($actual -eq $Expected) {
            Write-Host "  `u{2705} $Name" -ForegroundColor Green
            $script:pass++
        } else {
            Write-Host "  `u{274C} $Name (got $actual, expected $Expected)" -ForegroundColor Red
            $script:fail++
        }
    }
}

Write-Host "`nCategory Service Tests" -ForegroundColor Cyan
Write-Host "=====================`n" -ForegroundColor Cyan

if ($StartService) {
    Write-Host "Starting service..." -ForegroundColor Yellow
    $job = Start-Job -ScriptBlock { param($d) Set-Location $d; mvn spring-boot:run 2>&1 | Out-Null } -ArgumentList "$PSScriptRoot\services\category-service"
    $i = 0
    do { Start-Sleep -Seconds 2; $i++ } while ((-not (Get-NetTCPConnection -LocalPort 8084 -ErrorAction SilentlyContinue)) -and $i -lt 25)
    if (-not (Get-NetTCPConnection -LocalPort 8084 -ErrorAction SilentlyContinue)) {
        Write-Host "FAILED to start service" -ForegroundColor Red; exit 1
    }
    Write-Host "Service ready ($($i*2)s)`n" -ForegroundColor Green
}

Write-Host "--- Categories ---" -ForegroundColor Yellow
Test-Endpoint -Name "GET /api/categories" -Url "$BaseUrl/api/categories" -Expected 200
Test-Endpoint -Name "GET /api/categories/1" -Url "$BaseUrl/api/categories/1" -Expected 200
Test-Endpoint -Name "POST valid category" -Method POST -Url "$BaseUrl/api/categories" -Body '{"name":"NewCat","slug":"new-cat"}' -Expected 201
Test-Endpoint -Name "POST duplicate slug" -Method POST -Url "$BaseUrl/api/categories" -Body '{"name":"Dup","slug":"cpu"}' -Expected 409
Test-Endpoint -Name "POST blank name" -Method POST -Url "$BaseUrl/api/categories" -Body '{"slug":"bad"}' -Expected 400
Test-Endpoint -Name "POST bad slug format" -Method POST -Url "$BaseUrl/api/categories" -Body '{"name":"Bad","slug":"BAD SLUG!","isActive":true}' -Expected 400
Test-Endpoint -Name "POST name too short" -Method POST -Url "$BaseUrl/api/categories" -Body '{"name":"X","slug":"x"}' -Expected 400
Test-Endpoint -Name "GET 404 category" -Url "$BaseUrl/api/categories/999" -Expected 404

Write-Host "`n--- Attributes ---" -ForegroundColor Yellow
Test-Endpoint -Name "GET attributes by category" -Url "$BaseUrl/api/categories/1/attributes" -Expected 200
Test-Endpoint -Name "POST valid attribute" -Method POST -Url "$BaseUrl/api/categories/1/attributes" -Body '{"attributeName":"TestAttr","valueType":"STRING","isRequired":true}' -Expected 201
Test-Endpoint -Name "POST attr blank name" -Method POST -Url "$BaseUrl/api/categories/1/attributes" -Body '{"valueType":"STRING","isRequired":true}' -Expected 400
Test-Endpoint -Name "POST attr null valueType" -Method POST -Url "$BaseUrl/api/categories/1/attributes" -Body '{"attributeName":"test"}' -Expected 400
Test-Endpoint -Name "GET 404 attributes (bad category)" -Url "$BaseUrl/api/categories/999/attributes" -Expected 404
Test-Endpoint -Name "GET 404 unmapped route" -Url "$BaseUrl/api/categories/1/attributes/999" -Expected 404

Write-Host ""
Write-Host "Results: $pass passed, $fail failed" -ForegroundColor $(if ($fail -eq 0) { "Green" } else { "Red" })
exit $fail
