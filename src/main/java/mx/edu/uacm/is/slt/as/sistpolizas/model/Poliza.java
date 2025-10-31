package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
<<<<<<< HEAD
import java.util.UUID;
=======
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872

@Entity
public class Poliza {

    @Id
<<<<<<< HEAD
    private UUID   polizaid; //todo es el identificador
    private String tipo;
=======
    private String tipo;  //todo es el identificador
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872
    private String descripcion;
    private double monto;
    private String cliente_asegurado;


    public Poliza() {
    }
<<<<<<< HEAD

    public Poliza(UUID polizaid, String tipo, String descripcion, double monto, String cliente_asegurado) {
        this.polizaid = polizaid;
=======

    public Poliza(String tipo, String descripcion, double monto, String cliente_asegurado) {

>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.cliente_asegurado = cliente_asegurado;
    }

<<<<<<< HEAD
    public UUID getPolizaid() {
        return polizaid;
    }

    public void setPolizaid(UUID polizaid) {
        this.polizaid = polizaid;
    }
=======
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872

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
<<<<<<< HEAD
            return Objects.equals(polizaid, otraPoliza.polizaid);
=======
            return Objects.equals(tipo, otraPoliza.tipo);
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hashCode(polizaid);
=======
        return Objects.hashCode(tipo);
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return String.format("Poliza(%s, %s, %s, %.2f, %s)", polizaid, tipo, descripcion, monto, cliente_asegurado);
=======
        return String.format("Poliza(%s, %s, %.2f, %s)", tipo, descripcion, monto, cliente_asegurado);
>>>>>>> 096bed6ebecc49ce3cb45d04005501c12a163872
    }
}