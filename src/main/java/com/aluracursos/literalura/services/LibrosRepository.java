package com.aluracursos.literalura.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluracursos.literalura.model.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {
    List<Libros> findByTituloContainingIgnoreCase(String titulo);
}
