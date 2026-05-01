package cl.tarrobuild.category.controller;

import cl.tarrobuild.category.model.AttributeDefinition;
import cl.tarrobuild.category.service.AttributeDefinitionService;
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
    public ResponseEntity<AttributeDefinition> createAttribute(
            @PathVariable Long categoryId,
            @RequestBody AttributeDefinition attributeDefinition) {

        return new ResponseEntity<>(
                attributeDefinitionService.createAttribute(categoryId, attributeDefinition),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<AttributeDefinition>> getAttributesByCategory(
            @PathVariable Long categoryId) {

        return ResponseEntity.ok(
                attributeDefinitionService.getAttributesByCategory(categoryId)
        );
    }
}