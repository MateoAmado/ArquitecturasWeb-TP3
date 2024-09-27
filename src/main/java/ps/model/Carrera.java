package ps.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "carrera")
@Getter
@Setter
@NoArgsConstructor
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrera")
    private int idCarrera;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @ManyToMany(mappedBy = "carreras", fetch = FetchType.LAZY)
    private Set<ps.model.Estudiante> estudiantes;


    public Carrera(String nombre) {
        this.nombre = nombre;
        estudiantes = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Carrera '\n' " +
                "- idCarrera = " + idCarrera + '\n' +
                "- Nombre = " + nombre + '\n' +
                '.';

    }

    public void addEstudiante(Estudiante estudiante){
        if(estudiante != null){
            estudiantes.add(estudiante);
        }
    }
}
