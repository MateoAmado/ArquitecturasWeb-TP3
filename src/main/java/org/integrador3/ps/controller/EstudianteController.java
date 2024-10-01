package org.integrador3.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.integrador3.ps.model.Estudiante;
import org.integrador3.ps.repository.EstudianteRepository;

import responses.ErrorResponse;
import responses.EstudianteResponse;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;


    @GetMapping("/")
    public ResponseEntity<Object> obtenerTodosLosEstudiantes() {
        try {
            EstudianteResponse jr = new EstudianteResponse();
            return ResponseEntity.ok(jr);
        } catch (Exception e) {
            ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
        }
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

  /*  @GetMapping("/nroLibreta/{nroLibreta}")
    public List<Estudiante> obtenerJugadoresNroLibreta(@PathVariable int nroLibreta) {
        int idLibreta = Integer.valueOf(nroLibreta);
        return estudianteRepository.getEstudiantePorNroLibreta(idLibreta);
    }
*/
  /*  @GetMapping("/genero/{genero}")
    public List<Estudiante> obtenerJugadoresNroLibreta(@PathVariable String genero) {
        return estudianteRepository.getEstudiantesPorGenero(genero);
    }
*/

}
