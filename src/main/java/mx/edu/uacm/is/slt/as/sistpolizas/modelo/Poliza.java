package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poliza {

    @Id
    @GeneratedValue
    private UUID clave;

    private Integer tipo;
    private String descripcion;
    private double monto;

    //Muchas polizas pueden pertenecer a un solo cliente y se crea la columna de llave foránea en la tabla poliza
    @ManyToOne
    @JoinColumn(name = "curp_cliente", referencedColumnName = "curp")
    private Cliente cliente;

    public Poliza() {}

    public Poliza(UUID clave, Integer tipo, String descripcion, double monto) {
        this.clave = clave;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;

    }

    public UUID getClave() {
        return clave;
    }

    public void setClave(UUID clave) {
        this.clave = clave;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
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

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    @Override
    public String toString() {
        return "Poliza{" +
                "clave=" + clave +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\''+
                ", monto='" + monto +
                ", cliente=" + (cliente != null ? cliente.getCurp() : "null") +
                '}';
    }
}
