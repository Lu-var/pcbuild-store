package cl.pcbuildstore.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDateTime createdAt;

    //FKs de clases/entidad
    //Un usuario puede tener varias direcciones
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
}
