package com.aluracursos.literalura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
            @JsonAlias("title") String titulo,
            @JsonAlias("authors") List<Autor> autores,
            @JsonAlias("languages") List<String> idiomas,
            @JsonAlias("download_count") Long numeroDescargas) {

}
