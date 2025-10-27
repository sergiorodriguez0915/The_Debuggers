package mx.edu.uacm.is.slt.as.sistpolizas.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @PutMapping("/{curp}/{direccion}/{fechaNacimiento}/{nombres}/{primerApellido}")
    public ResponseEntity<String> actualizarClienteSinSegundoApellido(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fechaNacimiento,
            @PathVariable String nombres,
            @PathVariable String primerApellido) {

        return ResponseEntity.ok("Cliente actualizado");
    }

    @PutMapping("/{curp}/{direccion}/{fechaNacimiento}/{nombres}/{primerApellido}/{segundoApellido}")
    public ResponseEntity<String> actualizarClienteConSegundoApellido(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fechaNacimiento,
            @PathVariable String nombres,
            @PathVariable String primerApellido,
            @PathVariable String segundoApellido) {

        return ResponseEntity.ok("Cliente actualizado");
    }

}
