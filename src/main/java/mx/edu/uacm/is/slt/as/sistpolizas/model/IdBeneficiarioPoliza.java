package mx.edu.uacm.is.slt.as.sistpolizas.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class IdBeneficiarioPoliza implements Serializable {
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    private Date fecha_nacimiento;
    private UUID clave_poliza;

    private static final long serialVersionid = 52711849321L;

    public IdBeneficiarioPoliza(){

    }

    public IdBeneficiarioPoliza(String nombre, String p_apellido, String s_apellido, Date fecha_nacimiento, UUID idpoliza) {
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.clave_poliza = idpoliza;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public UUID getClave_poliza() {
        return clave_poliza;
    }

    public void setClave_poliza(UUID idpoliza) {
        this.clave_poliza = idpoliza;
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o)){
            return true;
        } else if (o instanceof IdBeneficiarioPoliza) {
            IdBeneficiarioPoliza otroIdBeneficiario = (IdBeneficiarioPoliza) o;
            return Objects.equals(nombre, otroIdBeneficiario.nombre) &&
                    Objects.equals(p_apellido,
                            otroIdBeneficiario.p_apellido) &&
                    Objects.equals(s_apellido,
                            otroIdBeneficiario.s_apellido) &&
                    Objects.equals(fecha_nacimiento,
                            otroIdBeneficiario.fecha_nacimiento) &&
                    Objects.equals(clave_poliza, otroIdBeneficiario.clave_poliza);
        } else {
                return false;
            }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, p_apellido, s_apellido, fecha_nacimiento, clave_poliza);
    }

    @Override
    public String toString() {
        return String.format("idBeneficiarioPoliza: (%s, %s, %s, %s, %s)", nombre,p_apellido,s_apellido,fecha_nacimiento, clave_poliza);
    }
}
