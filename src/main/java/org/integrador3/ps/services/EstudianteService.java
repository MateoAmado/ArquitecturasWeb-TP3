package org.integrador3.ps.services;

import org.integrador3.ps.model.Estudiante;
import org.integrador3.ps.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> obtenerTodasLosEstudiantes() {
        return estudianteRepository.obtenerTodasLosEstudiantes();
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }


    public Estudiante getEstudiantePorNroLibreta(int idLibreta) {
        Estudiante e=estudianteRepository.findEstudianteByNumeroLibretaUniversitaria(idLibreta);
        return e;
    }

    public List<Estudiante> getEstudiantesPorGenero(String genero) {
        List<Estudiante> estudiantes=estudianteRepository.getEstudianteByGenero(genero);
        return estudiantes;
    }
}
