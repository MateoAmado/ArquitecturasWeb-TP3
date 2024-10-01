package org.integrador3.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.integrador3.ps.repository.CarreraRepository;

import responses.CarreraResponse;
import responses.ErrorResponse;
import org.integrador3.ps.model.Carrera;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    @Autowired
    private CarreraRepository carreraRepository;


    @GetMapping("/")
    public ResponseEntity<Object> obtenerTodasLasCarreras() {
        try {
            CarreraResponse jr = new CarreraResponse();
            return ResponseEntity.ok(jr);
        } catch (Exception e) {
            ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
        }
    }

    @PostMapping
    public Carrera crearCarrera(@RequestBody Carrera carrera) {
        return carreraRepository.save(carrera);
    }


}
