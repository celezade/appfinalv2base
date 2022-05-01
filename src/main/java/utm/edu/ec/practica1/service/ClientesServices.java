package utm.edu.ec.practica1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Clientes;
import utm.edu.ec.practica1.repository.IClientesRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientesServices implements IClientesService{
    @Autowired
    IClientesRepository clientesRepository;

    @Override
    public void saveClientes(Clientes clientes) {clientesRepository.save(clientes);}


    @Override
    public List<Clientes> findClientesByValue(String cedula) {return clientesRepository.findClientesByValue (cedula);}

    @Override
    public void deleteClientes(String cedula) {
        List<Clientes> clientes=clientesRepository.findClientesByValue(cedula);
        clientes.forEach(x->{
            clientesRepository.deleteById(x.getId());
        });
    }
}
