package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String descripcion;
    private double monto;
    private String cliente_asegurado;


    public Poliza() {}

    public Poliza(Long id, String tipo, String descripcion, double monto, String cliente_asegurado) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.cliente_asegurado = cliente_asegurado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public String toString() {
        return "Poliza{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\''+
                ", monto='" + monto + '\''+
                ", cliente_asegurado='" + cliente_asegurado + '\''+
                '}';
    }
}
