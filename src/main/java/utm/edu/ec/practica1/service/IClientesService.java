package utm.edu.ec.practica1.service;

import utm.edu.ec.practica1.entity.Clientes;
import utm.edu.ec.practica1.entity.Provider;

import java.util.List;

public interface IClientesService {
    void saveClientes (Clientes clientes);
    List<Clientes> findClientesByValue(String cedula);


    void deleteClientes (String cedula);

    List<Clientes> findClientes();
}
