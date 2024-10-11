package org.integrador3.ps.controller;

import org.integrador3.ps.dto.EstudianteCarreraDTO;
import org.integrador3.ps.model.Estudiante_Carrera;
import org.integrador3.ps.services.CarreraService;
import org.integrador3.ps.services.EstudianteCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante_carrera")
public class EstudianteCarreraController {

 @Autowired
 private EstudianteCarreraService estudianteCarreraService;


    // Obtener todos los jugadores
 @GetMapping("/")
 public ResponseEntity<List<EstudianteCarreraDTO>> obtenerTodasLasCarrerasConEstudiantes() {
    List<EstudianteCarreraDTO> carreras = estudianteCarreraService.obtenerTodasLasCarrerasConEstudiantes();
    return new ResponseEntity<>(carreras, HttpStatus.OK);
 }


 @PostMapping
 public ResponseEntity<EstudianteCarreraDTO> crearEstudianteCarrera(@RequestBody Estudiante_Carrera estudianteCarrera) {
  System.out.println(estudianteCarrera.toString());
  EstudianteCarreraDTO nuevoEstudianteCarrera = estudianteCarreraService.save(estudianteCarrera);
  return ResponseEntity.ok(nuevoEstudianteCarrera);
 }

/*
 {
  "estudianteCarreraId": {
  "estudianteId": 1,
          "carreraId": 2
 },
  "fechaInscripcion": "2024-10-04",
         "graduado": false
 }
*/
}
