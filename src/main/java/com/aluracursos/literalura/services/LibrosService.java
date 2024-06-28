package com.aluracursos.literalura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluracursos.literalura.model.Libros;

@Service
public class LibrosService {
    @Autowired
    private LibrosRepository librosRepository;

    public void guardarLibro(Libros libro) {
        librosRepository.save(libro);
    }

    public List<Libros> buscarLibrosPorTitulo(String titulo) {
        return librosRepository.findByTituloContainingIgnoreCase(titulo);
    }
}
