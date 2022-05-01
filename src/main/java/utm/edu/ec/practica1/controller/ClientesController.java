package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Clientes;
import utm.edu.ec.practica1.entity.Customer;
import utm.edu.ec.practica1.service.ClientesServices;
import utm.edu.ec.practica1.service.IClientesService;


import java.util.List;
@RestController
@RequestMapping(path="/clientes")
public class ClientesController {
    @Autowired
    private IClientesService clientesServices;

    @PostMapping()
    public void saveClientes(@RequestBody Clientes clientes) {
        clientesServices.saveClientes(clientes);
    }

    @GetMapping()

    public List<Clientes> findClientes() {
        return clientesServices.findClientes();
    }
    public List<Clientes> findClientesByValue(@RequestParam String cedula)
     {
        return clientesServices.findClientesByValue(cedula);
    }



    @DeleteMapping()
    public void deleteClientes(@RequestParam String cedula){
        clientesServices.deleteClientes(cedula);

    }

}
