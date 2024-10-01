package org.integrador3.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.integrador3.ps.model.Carrera;

import java.util.List;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

    @Query("SELECT c FROM Carrera c")
    List<Carrera> obtenerTodasLasCarreras();

    @Query("SELECT c FROM Carrera c WHERE c.nombre = :nombre")
    List<Carrera> findCarrerasPorNombre(String nombre);
}

