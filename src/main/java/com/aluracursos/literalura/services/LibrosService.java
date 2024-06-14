package com.aluracursos.literalura.services;

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
}
