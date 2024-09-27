package rs.responses;

import lombok.NoArgsConstructor;
import ps.model.Carrera;
import ps.model.Estudiante;

import java.util.List;

@NoArgsConstructor
public class CarreraResponse{
    List<Carrera> carreras;
    public CarreraResponse(List<Carrera> estudiantes) {
        this.carreras = estudiantes;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

}
