package com.aluracursos.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
            @JsonAlias("title") String titulo,
            @JsonAlias("authors") String autores,
            @JsonAlias("languages") String idiomas,
            @JsonAlias("download_count") Long numeroDescargas) {

}
