package cl.tarrobuild.category.model;

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

}