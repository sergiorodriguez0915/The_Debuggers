package mx.edu.uacm.is.slt.as.sistpolizas.controller;

@RestController
public class ClienteController {
    @PutMapping(value={"/cliente/{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}/{s_Apellido}",
            "{curp}/{direccion}/{fecha_nacimiento}/{nombre}/{p_apellido}"})
    public ResponseEntity<String> actualizarCliente(
            @PathVariable String curp,
            @PathVariable String direccion,
            @PathVariable String fechaNacimiento,
            @PathVariable String nombres,
            @PathVariable String primerApellido,
            @PathVariable (required = false)String segundoApellido) {
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
        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setNombres(nombres);
        cliente.setPrimerApellido(primerApellido);

        clienteServicio.actualizarCliente(cliente);

        */
        return ResponseEntity.ok("Cliente actualizado");
        //log.info("Cliente actualizado");
    }


}
