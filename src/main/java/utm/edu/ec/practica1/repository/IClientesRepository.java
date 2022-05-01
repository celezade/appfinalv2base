package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Clientes;

import java.util.List;
import java.util.UUID;

public interface IClientesRepository extends JpaRepository<Clientes, UUID>,CustomClientesRepository {

}
