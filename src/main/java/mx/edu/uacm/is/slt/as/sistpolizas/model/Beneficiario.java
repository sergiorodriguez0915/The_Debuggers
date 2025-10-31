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

    public Beneficiario(Long id, String nombre, String p_apellido, String s_apellido, String fecha_nacimiento, String poliza_beneficiario, double porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.poliza_beneficiario = poliza_beneficiario;
        this.porcentaje = porcentaje;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
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
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido_p='" + p_apellido + '\''+
                ", apellido_m='" + s_apellido + '\''+
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", poliza_beneficiario='" + poliza_beneficiario + '\'' +
                ", porcentaje='" + porcentaje + '\''+
                '}';
    }
}

