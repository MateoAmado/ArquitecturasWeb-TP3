package org.integrador3.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.integrador3.ps.repository.EstudianteCarreraRepository;

import responses.ErrorResponse;
import responses.EstudianteCarreraResponse;

@RestController
@RequestMapping("/estudiante_carrera")
public class EstudianteCarreraController {

@Autowired
 private EstudianteCarreraRepository estudianteCarreraRepository;

 @Value("${variable_env}")
 private String variable_env;

 @GetMapping("/variable_env")
 public String obtener_variable_env() {
  return variable_env;
 }

 @GetMapping("/string")
 public String obtener_string_hardcodeado() {
  return "Un mensaje de texto.";
 }

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

}
