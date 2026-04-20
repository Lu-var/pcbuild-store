package cl.pcbuildstore.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //FKs de clases/entidad
    //Una region puede tener varias ciudades
    @OneToMany(mappedBy = "region")
    private List<Ciudad> ciudades;
}
