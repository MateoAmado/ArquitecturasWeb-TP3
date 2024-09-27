package rs.responses;

import lombok.NoArgsConstructor;
import ps.model.Estudiante;
import ps.model.Estudiante_Carrera;

import java.util.List;

@NoArgsConstructor
public class EstudianteCarreraResponse{
    List<Estudiante_Carrera> estudiantes_carreras;
    public EstudianteCarreraResponse(List<Estudiante_Carrera> estudiantes_carreras) {
        this.estudiantes_carreras = estudiantes_carreras;
    }

    public List<Estudiante_Carrera> getEstudiantes_carreras() {
        return estudiantes_carreras;
    }

    public void setEstudiantes_carreras(List<Estudiante_Carrera> estudiantes_carreras) {
        this.estudiantes_carreras = estudiantes_carreras;
    }

}
