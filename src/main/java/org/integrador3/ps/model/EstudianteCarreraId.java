package org.integrador3.ps.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class EstudianteCarreraId implements Serializable {

    @Column(name = "estudiante_numero_documento")
    private Long estudianteNumeroDocumento;

    @Column(name = "id_carrera")
    private Long IdCarrera;

    public EstudianteCarreraId(Long estudianteNumeroDocumento, Long idCarrera){
        this.estudianteNumeroDocumento = estudianteNumeroDocumento;
        IdCarrera = idCarrera;
    }

    public EstudianteCarreraId() {

    }

}
