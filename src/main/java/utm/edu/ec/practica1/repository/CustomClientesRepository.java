package utm.edu.ec.practica1.repository;

import utm.edu.ec.practica1.entity.Clientes;

import java.util.List;

public interface CustomClientesRepository {
    List<Clientes> findClientesByValue(String cedula);

}
