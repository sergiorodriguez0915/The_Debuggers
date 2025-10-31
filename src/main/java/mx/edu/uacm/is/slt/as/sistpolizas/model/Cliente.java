package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;


@Entity
public class Cliente {

    private String nombre;
    private String p_apellido;
    private String s_apellido;
    private String direccion;

    @Id
    private String curp;
    private Date fecha_nacimiento;

    // constructor vacio
    public Cliente() {
    }

    // constructor con parametros
    public Cliente(String nombre, String p_apellido, String s_apellido, String direccon, String curp, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.direccion = direccon;
        this.curp = curp;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // getters y setters

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    @Override
    public boolean equals(Object o){
        if(super.equals(o)){
            return true;
        } else if (o instanceof Cliente) {
            Cliente otroCliente = (Cliente) o;
                return Objects.equals(curp, otroCliente.curp);
            } else {
                return false;
            }//comprueba equivalencia
        }//equals

    @Override
    public  int hashCode(){ //hace hashcode con el codigo de la curp internamente
        return Objects.hashCode(curp);
    }

    @Override
    public String toString() {
        return String.format("Cliente(%s, %s, %s, %s, %s, %s)", nombre,p_apellido,s_apellido,direccion,curp,fecha_nacimiento);
    }
}

