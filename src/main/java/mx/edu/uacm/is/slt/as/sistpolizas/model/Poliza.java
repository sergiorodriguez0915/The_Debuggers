package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Poliza {

    @Id
    private String tipo;  //todo es el identificador
    private String descripcion;
    private double monto;
    private String cliente_asegurado;


    public Poliza() {
    }

    public Poliza(String tipo, String descripcion, double monto, String cliente_asegurado) {

        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.cliente_asegurado = cliente_asegurado;
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
            return Objects.equals(tipo, otraPoliza.tipo);
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }

    @Override
    public String toString() {
        return String.format("Poliza(%s, %s, %.2f, %s)", tipo, descripcion, monto, cliente_asegurado);
    }
}