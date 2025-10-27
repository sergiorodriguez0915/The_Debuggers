package mx.edu.uacm.is.slt.as.sistpolizas.controlador;

import mx.edu.uacm.is.slt.as.sistpolizas.modelo.Cliente;
import mx.edu.uacm.is.slt.as.sistpolizas.servicio.ClienteServicio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    private ClienteServicio clienteServicio;

    @PutMapping("/{curp}/{direccion}/{fechaNacimiento}/{nombres}/{primerApellido}/{segundoApellido}")
    public ResponseEntity<String> actualizarCliente(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fechaNacimiento,
            @PathVariable String nombres,
            @PathVariable String primerApellido,
            @PathVariable String segundoApellido) {
        //Falta crear e implementar buscarCliente por CURP
        Cliente cliente = clienteServicio.buscarCliente(curp);
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
            cliente.setFechaNacimiento(fecha);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Formato de fecha inválido. Usa yyyy-MM-dd");
        }

        cliente.setDireccion(direccion);
        cliente.setNombres(nombres);
        cliente.setPrimerApellido(primerApellido);

        //Falta crear e implementar actualizarCliente
        clienteServicio.actualizarCliente(cliente);
        return ResponseEntity.ok("Cliente actualizado");
    }
}
