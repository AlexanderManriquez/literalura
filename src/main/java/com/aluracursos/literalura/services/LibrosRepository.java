package com.aluracursos.literalura.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluracursos.literalura.model.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {

}
