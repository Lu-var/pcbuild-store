package cl.tarrobuild.category.controller;


import com.tarrobuild.categoryservice.entity.AttributeDefinition;
import com.tarrobuild.categoryservice.service.AttributeDefinitionService;
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

            AttributeDefinition savedAttribute =
                    attributeDefinitionService.createAttribute(categoryId, attributeDefinition);

            return new ResponseEntity<>(savedAttribute, HttpStatus.CREATED);
        }

        @GetMapping
        public ResponseEntity<List<AttributeDefinition>> getAttributesByCategory(
                @PathVariable Long categoryId) {

            return ResponseEntity.ok(attributeDefinitionService.getAttributesByCategory(categoryId));
        }
    }
}
