package ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ps.model.Estudiante;


import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    Object obtenerTodosLosJugadores();

    @Query("SELECT e FROM Estudiante e WHERE e.numeroLibretaUniversitaria = :nro")
    List<Estudiante> getEstudiantePorNroLibreta(int nro);

    @Query("SELECT e FROM Estudiante e WHERE e.genero = :genero")
     List<Estudiante> getEstudiantesPorGenero(String genero);
}

