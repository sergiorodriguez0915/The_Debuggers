package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Poliza {

    @Id
<<<<<<< HEAD
    private UUID   polizaid; //todo es el identificador
    private String tipo;
    private String descripcion;
    private double monto;
    private String cliente_asegurado;
=======
    private UUID clave; //todo es el identificador
    private String tipo;
    private String descripcion;
    private double monto;
    private String curp_cliente;
>>>>>>> developer


    public Poliza() {
    }

    public Poliza(UUID polizaid, String tipo, String descripcion, double monto, String cliente_asegurado) {
<<<<<<< HEAD
        this.polizaid = polizaid;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.cliente_asegurado = cliente_asegurado;
    }

    public UUID getPolizaid() {
        return polizaid;
    }

    public void setPolizaid(UUID polizaid) {
        this.polizaid = polizaid;
=======
        this.clave = polizaid;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.curp_cliente = cliente_asegurado;
    }

    public UUID getClave() {
        return clave;
    }

    public void setClave(UUID polizaid) {
        this.clave = polizaid;
>>>>>>> developer
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

<<<<<<< HEAD
    public String getCliente_asegurado() {
        return cliente_asegurado;
    }

    public void setCliente_asegurado(String cliente_asegurado) {
        this.cliente_asegurado = cliente_asegurado;
=======
    public String getCurp_cliente() {
        return curp_cliente;
    }

    public void setCurp_cliente(String curp_cliente) {
        this.curp_cliente = curp_cliente;
>>>>>>> developer
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        } else if (o instanceof Poliza) {
            Poliza otraPoliza = (Poliza) o;
<<<<<<< HEAD
            return Objects.equals(polizaid, otraPoliza.polizaid);
=======
            return Objects.equals(clave, otraPoliza.clave);
>>>>>>> developer
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hashCode(polizaid);
=======
        return Objects.hashCode(clave);
>>>>>>> developer
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return String.format("Poliza(%s, %s, %s, %.2f, %s)", polizaid, tipo, descripcion, monto, cliente_asegurado);
=======
        return String.format("Poliza(%s, %s, %s, %.2f, %s)", clave, tipo, descripcion, monto, curp_cliente);
>>>>>>> developer
    }
}