//Esta interfaz gestiona la entidad Beneficiario y su clave primaria es la clase compuesta IdBeneficiarioPoliza (que definiste como @Embeddable).
package mx.edu.uacm.is.slt.as.sistpolizas.repository; // ¡PACKAGE FINAL CORRECTO!

import mx.edu.uacm.is.slt.as.sistpolizas.model.Beneficiario; // Importación correcta
import mx.edu.uacm.is.slt.as.sistpolizas.model.IdBeneficiarioPoliza; // Importación correcta
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.Date;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, IdBeneficiarioPoliza> {

    // Métodos adaptados a los atributos de la clave compuesta IdBeneficiarioPoliza
    Optional<Beneficiario> findByIdNombreAndIdP_apellidoAndIdS_apellido(
            String nombre,
            String p_apellido,
            String s_apellido
    );

    Optional<Beneficiario> findByIdFecha_nacimiento(Date fechaNacimiento);
}