package org.integrador3.ps.controller;

import org.integrador3.ps.model.Carrera;
import org.integrador3.ps.model.Estudiante;
import org.integrador3.ps.model.EstudianteCarreraId;
import org.integrador3.ps.model.Estudiante_Carrera;
import org.integrador3.ps.services.EstudianteCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.integrador3.ps.repository.EstudianteCarreraRepository;

import responses.ErrorResponse;
import responses.EstudianteCarreraResponse;

import java.sql.Date;
import java.time.LocalDate;

@RestController
@RequestMapping("/estudiante_carrera")
public class EstudianteCarreraController {

 @Autowired
 private EstudianteCarreraService estudianteCarreraService;


    // Obtener todos los jugadores
 @GetMapping
 public ResponseEntity<Object> obtenerTodasLasCarrerasConEstudiantes() {
  try {
   EstudianteCarreraResponse jr = new EstudianteCarreraResponse();
   return ResponseEntity.ok(jr);
  } catch (Exception e) {
   ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
  }
 }


 @PostMapping
 public ResponseEntity<Estudiante_Carrera> crearEstudianteCarrera(@RequestBody Estudiante_Carrera estudianteCarrera) {
  Estudiante_Carrera nuevoEstudianteCarrera = estudianteCarreraService.save(estudianteCarrera);
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
