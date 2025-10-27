package mx.edu.uacm.is.slt.as.sistpolizas.controlador;

import mx.edu.uacm.is.slt.as.sistpolizas.modelo.Poliza;
import mx.edu.uacm.is.slt.as.sistpolizas.servicio.PolizaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;


@RestController
@RequestMapping("/poliza")
public class PolizaControlador {
    @Autowired
    private PolizaServicio polizaServicio;

    @PutMapping("/{clave}/{tipo}/{monto}/{descripcion}/{curp_cliente}")
    public ResponseEntity<String> actualizarPoliza(
            @PathVariable UUID clave,
            @PathVariable Integer tipo,
            @PathVariable float monto,
            @PathVariable String descripcion,
            @PathVariable String curpCliente)
    {
        //Como todavia no hay servicios con implementaciones como tal, le nombrare buscarPorClave
        Poliza poliza = polizaServicio.buscarPorClave(clave);
        if (poliza == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Poliza no encontrada");
        }
        if(tipo == null || monto == null || descripcion == null || curpCliente == null){
            return ResponseEntity.badRequest().body("Hay un campo de la poliza nulo");
        }
        if (monto < 0.01 || monto > 9999999.99) {
            return ResponseEntity.badRequest().body("Monto fuera de rango permitido");
        }

        poliza.setTipo(tipo);
        poliza.setMonto(monto);
        poliza.setDescripcion(descripcion);
        poliza.setCurpCliente(curpCliente);

        //El nombre del servicio debera ser actualizarPoliza
        polizaServicio.actualizarPoliza(poliza);
        return ResponseEntity.ok("Poliza actualizada");
    }

    @DeleteMapping("/{clave}")
    public ResponseEntity<String> borrarPoliza(
            @PathVariable UUID clave)
    {
        Poliza poliza = polizaServicio.buscarPorClave(clave);
        if (poliza == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Poliza no encontrada");
        }

        //Otro servicio que se debera llamar es borrarPoliza
        polizaServicio.borrarPoliza(poliza);
        return ResponseEntity.ok("Poliza borrada");
    }

}
