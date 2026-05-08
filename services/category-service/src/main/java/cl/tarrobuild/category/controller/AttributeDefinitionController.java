package cl.tarrobuild.category.controller;

import cl.tarrobuild.category.dto.AttributeDefinitionRequest;
import cl.tarrobuild.category.dto.AttributeDefinitionResponse;
import cl.tarrobuild.category.model.AttributeDefinition;
import cl.tarrobuild.category.service.AttributeDefinitionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories/{categoryId}/attributes")
public class AttributeDefinitionController {

    private final AttributeDefinitionService attributeDefinitionService;

    public AttributeDefinitionController(AttributeDefinitionService attributeDefinitionService) {
        this.attributeDefinitionService = attributeDefinitionService;
    }

    @PostMapping
    public ResponseEntity<AttributeDefinitionResponse> createAttribute(
            @PathVariable Long categoryId,
            @Valid @RequestBody AttributeDefinitionRequest request) {

        return new ResponseEntity<>(
                attributeDefinitionService.createAttribute(categoryId, request),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<AttributeDefinitionResponse>> getAttributesByCategory(
            @PathVariable Long categoryId) {

        return ResponseEntity.ok(
                attributeDefinitionService.getAttributesByCategory(categoryId)
        );
    }
}