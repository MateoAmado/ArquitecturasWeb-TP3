package org.integrador3.ps.model;
import jakarta.persistence.*;
import org.integrador3.ps.model.Estudiante;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "Carrera")
@Table(name = "carrera")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Long idCarrera;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "valor")
    private double valor;  // Nuevo atributo

    @Column(name = "posicion")
    private String posicion;  // Nuevo atributo

    @ManyToMany(mappedBy = "carreras", fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantes;

    public Carrera(String nombre, double valor, String posicion) {
        this.nombre = nombre;
        this.valor = valor;
        this.posicion = posicion;
        estudiantes = new HashSet<>();
    }

    public Carrera() {}

    // Getters y Setters para los nuevos atributos
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Carrera '\n' " +
                "- idCarrera = " + idCarrera + '\n' +
                "- Nombre = " + nombre + '\n' +
                "- Valor = " + valor + '\n' +
                "- Posicion = " + posicion + '\n' +
                '.';
    }

    public void addEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            estudiantes.add(estudiante);
        }
    }
}
