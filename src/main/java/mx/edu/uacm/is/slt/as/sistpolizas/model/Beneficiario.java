package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Beneficiario {

    @EmbeddedId
    /*private String nombre;
    private String p_apellido;
    private String s_apellido;
    private Date fecha_nacimiento;
    */
    private String poliza_beneficiario;
    private double porcentaje;

    // Constructor vacío
    public Beneficiario() {
    }

    // Constructor con parámetros


    public Beneficiario(String poliza_beneficiario, double porcentaje) {
        this.poliza_beneficiario = poliza_beneficiario;
        this.porcentaje = porcentaje;
    }

    // Getters y Setters


    public String getPoliza_beneficiario() {
        return poliza_beneficiario;
    }

    public void setPoliza_beneficiario(String poliza_beneficiario) {
        this.poliza_beneficiario = poliza_beneficiario;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        } else if (o instanceof Beneficiario) {
            Beneficiario otroBeneficiario = (Beneficiario) o;
            return Objects.equals(poliza_beneficiario, otroBeneficiario.poliza_beneficiario);
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(poliza_beneficiario);
    }

    @Override
    public String toString() {
        return String.format("Beneficiario: (%s, %s )",poliza_beneficiario,porcentaje);
    }

}