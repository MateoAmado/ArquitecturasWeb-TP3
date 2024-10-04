package org.integrador3.ps.services;

import org.integrador3.ps.model.Estudiante_Carrera;
import org.integrador3.ps.repository.EstudianteCarreraRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteCarreraService {
    private EstudianteCarreraRepository estudianteCarreraRepository;

    public Estudiante_Carrera save(Estudiante_Carrera estudianteCarrera){
        return this.estudianteCarreraRepository.save(estudianteCarrera);
    }
}
