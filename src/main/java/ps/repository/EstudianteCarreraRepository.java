package ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ps.model.Estudiante_Carrera;
import ps.model.EstudianteCarreraId;

import java.util.List;

@Repository
public interface EstudianteCarreraRepository extends JpaRepository<Estudiante_Carrera, Long> {

    @Query("SELECT ec FROM estudiante_carrera ec")
    List<Estudiante_Carrera> findJugadoresConValorMayorQue();





}
