package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

    @Entity
    @Table(name = "attribute_definitions")
    public class AttributeDefinition {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String attributeName;

        @Column(nullable = false)
        private String valueType;

        @Column(nullable = false)
        private Boolean isRequired;

        @ManyToOne
        @JoinColumn(name = "category_id", nullable = false)
        @JsonIgnoreProperties("attributes")
        private Category category;

        public AttributeDefinition() {}

        // GETTERS

        public Long getId() {
            return id;
        }

        public String getAttributeName() {
            return attributeName;
        }

        public String getValueType() {
            return valueType;
        }

        public Boolean getIsRequired() {
            return isRequired;
        }

        public Category getCategory() {
            return category;
        }

        // SETTERS

        public void setAttributeName(String attributeName) {
            this.attributeName = attributeName;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public void setIsRequired(Boolean required) {
            isRequired = required;
        }

        public void setCategory(Category category) {
            this.category = category;
        }
    }
}
