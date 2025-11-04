package mx.edu.uacm.is.slt.as.sistpolizas.repository; // PACKAGE FINAL CORRECTO

import mx.edu.uacm.is.slt.as.sistpolizas.model.Cliente; // Importación correcta
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

    // Atributos del modelo Cliente
    Optional<Cliente> findByNombreAndP_apellidoAndS_apellido(
            String nombre, // Parámetro 'nombre'
            String p_apellido, // Parámetro 'p_apellido'
            String s_apellido // Parámetro 's_apellido'
    );
}