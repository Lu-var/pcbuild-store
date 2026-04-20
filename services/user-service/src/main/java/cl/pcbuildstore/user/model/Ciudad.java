package cl.pcbuildstore.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //Varias ciudades pueden tener la misma region
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    //Una ciudad puede aparecer en varias direcciones
    @OneToMany(mappedBy = "ciudad")
    private List<Address> addresses;
}
