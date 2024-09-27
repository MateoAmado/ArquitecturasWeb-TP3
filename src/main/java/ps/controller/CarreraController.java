package ps.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.repository.CarreraRepository;

import rs.responses.CarreraResponse;
import rs.responses.ErrorResponse;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    private CarreraRepository carreraRepository;

    @GetMapping
    public ResponseEntity<Object> obtenerTodasLasCarreras() {
        try {
            // TODO: Pasar al service.
            CarreraResponse jr = new CarreraResponse();
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


}
