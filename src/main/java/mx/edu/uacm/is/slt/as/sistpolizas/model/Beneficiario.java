package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Beneficiario {

    @Id
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    private Date fecha_nacimiento;
    private String poliza_beneficiario;
    private double porcentaje;

    // Constructor vacío
    public Beneficiario() {
    }

    // Constructor con parámetros
    public Beneficiario(String nombre, String p_apellido, String s_apellido, Date fecha_nacimiento, String poliza_beneficiario, double porcentaje) {
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.poliza_beneficiario = poliza_beneficiario;
        this.porcentaje = porcentaje;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

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
            return Objects.equals(nombre, otroBeneficiario.nombre);
        } else {
            return false;
        } // comprueba equivalencia
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return String.format("Beneficiario: (%s, %s, %s, %s, %s, %s)", nombre,p_apellido,s_apellido,fecha_nacimiento,poliza_beneficiario,porcentaje);
    }

}