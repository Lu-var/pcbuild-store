package cl.tarrobuild.category.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "attribute_definitions")
@Getter
@Setter
@NoArgsConstructor
public class AttributeDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String attributeName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AttributeValueType valueType;

    @Column(nullable = false)
    private Boolean isRequired;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}