package org.integrador3.ps.services;

import org.integrador3.ps.model.Carrera;
import org.integrador3.ps.repository.CarreraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {

    private CarreraRepository carreraRepository;

    public CarreraService(CarreraRepository carreraRepository) {
        this.carreraRepository = carreraRepository;
    }

    public List<Carrera> obtenerTodasLasCarreras() {
        return carreraRepository.obtenerTodasLasCarreras();
    }


    public Carrera guardarCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }
}
