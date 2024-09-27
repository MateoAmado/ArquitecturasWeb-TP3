package ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ps.model.Carrera;
import ps.model.Estudiante_Carrera;

import java.util.List;

public interface CarreraRepository extends JpaRepository<Carrera, Long>{

    @Query("SELECT ec FROM carrera ec")
    List<Estudiante_Carrera> findJugadoresConValorMayorQue();
    public List<Carrera> obtenerCarreas();



}
