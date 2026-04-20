package cl.pcbuildstore.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String codigoPostal;
    private Boolean esPrincipal;

    //FKs de clases/entidad
    //Varias direcciones pueden tener un mismo usuario
    //Direcciones corresponden a un usuario único
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Varias direcciones pueden tener la misma region
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    //Varias direcciones pueden tener la misma ciudad
    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;
}