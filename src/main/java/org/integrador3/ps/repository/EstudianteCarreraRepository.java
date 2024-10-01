package org.integrador3.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.integrador3.ps.model.Estudiante_Carrera;

import java.util.List;

@Repository
public interface EstudianteCarreraRepository extends JpaRepository<Estudiante_Carrera, Long> {






}
