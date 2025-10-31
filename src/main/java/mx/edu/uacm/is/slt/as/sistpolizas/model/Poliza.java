package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Poliza {

    @Id
    private UUID   polizaid; //todo es el identificador
    private String tipo;
    private String descripcion;
    private double monto;
    private String cliente_asegurado;


    public Poliza() {
    }

    public Poliza(UUID polizaid, String tipo, String descripcion, double monto, String cliente_asegurado) {
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

    public String getCliente_asegurado() {
        return cliente_asegurado;
    }

    public void setCliente_asegurado(String cliente_asegurado) {
        this.cliente_asegurado = cliente_asegurado;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        } else if (o instanceof Poliza) {
            Poliza otraPoliza = (Poliza) o;
            return Objects.equals(polizaid, otraPoliza.polizaid);
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(polizaid);
    }

    @Override
    public String toString() {
        return String.format("Poliza(%s, %s, %s, %.2f, %s)", polizaid, tipo, descripcion, monto, cliente_asegurado);
    }
}