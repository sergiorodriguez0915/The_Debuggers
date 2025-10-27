package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String p_apellido;
    private String s_apellido;
    private String direccion;
    private String curp;
    private String fecha_nacimiento;

    // constructor vacio
    public Cliente() {
    }

    // constructor con parametros
    public Cliente(Long id, String nombre, String p_apellido, String s_apellido, String direccon, String curp, String fecha_nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.direccion = direccon;
        this.curp = curp;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // getters y setters
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

    public String getDereccion() {
        return direccion;
    }

    public void setDereccion(String dereccion) {
        this.direccion = dereccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido_p='" + p_apellido + '\''+
                ", apellido_m='" + s_apellido + '\''+
                ", direccion='" + direccion + '\'' +
                ", curp='" + curp + '\'' +
                " fecha_nacimiento='" + fecha_nacimiento + '\''+
                '}';
    }
}

