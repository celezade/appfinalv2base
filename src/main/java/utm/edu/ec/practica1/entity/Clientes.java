package utm.edu.ec.practica1.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String cedula;
    private String name;
    private String lastname;
    private String phone;
    private String correo;
    private String address;
    private String usuario;
    private String clave;
}
