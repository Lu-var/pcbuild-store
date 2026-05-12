package cl.tarrobuild.provider.dto;

public class ProviderResponse {

    private Long id;

    private String name;

    private String contact;

    private String website;

    private Boolean isActive;

    public ProviderResponse() {
    }

    public ProviderResponse(
            Long id,
            String name,
            String contact,
            String website,
            Boolean isActive) {

        this.id = id;
        this.name = name;
        this.contact = contact;
        this.website = website;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }

    public Boolean getIsActive() {
        return isActive;
    }
}