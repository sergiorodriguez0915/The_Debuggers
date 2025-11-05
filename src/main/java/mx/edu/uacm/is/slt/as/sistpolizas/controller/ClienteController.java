package mx.edu.uacm.is.slt.as.sistpolizas.controller;

import mx.edu.uacm.is.slt.as.sistpolizas.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

/*
    //Repositorios
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

*/
    //Servicio REST GET
    @GetMapping("/cliente/{curp}")
    public ResponseEntity<String> getCliente(@PathVariable String curp){
        //Aqui va la implementacion
        //Cliente cliente = ClienteRepository.findByCurp(curp);

        //Cliente cliente = new Cliente();
        return ResponseEntity.ok("Cliente devuelto");
    }

    //Servicio REST  POST
    @PostMapping(value = {"/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}/{s_apellido}",
                          "/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}"})
    public ResponseEntity<String> createCliente(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fecha_nacimiento,
            @PathVariable String nombre,
            @PathVariable String p_apellido,
            @PathVariable (required = false)String s_apellido) {
        //Aquí va la implementación
        //Cliente cliente = new Cliente();
        return ResponseEntity.ok("Cliente registrado");
    }

    //Servicio REST PUT
    @PutMapping(value={"/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}/{s_apellido}",
                       "/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}"})
    public ResponseEntity<String> updateCliente(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fecha_nacimiento,
            @PathVariable String nombre,
            @PathVariable String p_apellido,
            @PathVariable (required = false)String s_apellido) {
        //Aquí va la implementación
        //Mensaje de cliente actualizado
        return ResponseEntity.ok("Cliente actualizado");
    }
}
