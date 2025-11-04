package mx.edu.uacm.is.slt.as.sistpolizas.controller;

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
        //Cliente cliente = ClienteRepository.findByCurp(curp);
        //Aqui va la implementacion
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
    @PutMapping(value={"/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}/{s_Apellido}",
                       "{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}"})
    public ResponseEntity<String> updateCliente(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fecha_nacimiento,
            @PathVariable String nombre,
            @PathVariable String p_apellido,
            @PathVariable (required = false)String s_apellido) {
        //Mensaje de cliente actualizado
        return ResponseEntity.ok("Cliente actualizado");
        /*Posibles validaciones
        if (cliente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
        }
        if(direccion == null || fechaNacimiento == null || nombres == null || primerApellido == null){
            return ResponseEntity.badRequest().body("Existen campos nulos donde no deberia de haberlos");
        }
        if (segundoApellido != null && !segundoApellido.equals("")) {
            cliente.setSegundoApellido(segundoApellido);
        }

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = formato.parse(fechaNacimiento);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Formato de fecha inválido. Usa yyyy-MM-dd");
        }*/

        /*Posible implementacion
        Cliente cliente = clienteRepository.findByCurp(curp);

        cliente.setDireccion(direccion);
        cliente.setFecha_nacimiento(fechaNacimiento);
        cliente.setNombre(nombres);
        cliente.setP_apellido(primerApellido);

        clienteServicio.actualizarCliente(cliente);
        */

        //log.info("Cliente actualizado");
    }
}
