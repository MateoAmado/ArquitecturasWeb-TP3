package ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ps.model.Estudiante;
import ps.repository.EstudianteRepository;

import rs.responses.ErrorResponse;
import rs.responses.EstudianteResponse;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;


    @GetMapping
    public ResponseEntity<Object> obtenerTodosLosJugadores() {
        try {
            // TODO: Pasar al service.
            EstudianteResponse jr = new EstudianteResponse();
            // Algun llamado al service.
            //throw new Exception("Este es un mensaje opcional");
            return ResponseEntity.ok(jr);
        } catch (Exception e) {
            // Ojo con esto por que puede enviar un error de BD al front,
            // se deberia controlar con e custom o error generico.
            ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
        }
    }

    @PostMapping
    public Estudiante crearJugador(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @GetMapping("/nroLibreta")
    public List<Estudiante> obtenerJugadoresNroLibreta(@PathVariable int nroLibreta) {
        int idLibreta = Integer.valueOf(nroLibreta);
        return estudianteRepository.getEstudiantePorNroLibreta(idLibreta);
    }

    @GetMapping("/genero")
    public List<Estudiante> obtenerJugadoresNroLibreta(@PathVariable String genero) {
        return estudianteRepository.getEstudiantesPorGenero(genero);
    }


}
