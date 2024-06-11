package com.aluracursos.literalura.model;

public class Libros {
    private String titulo;
    private String autores;
    private String idiomas;
    private Long numeroDescargas;

    public Libros(){}
    
    public Libros(String titulo, String autores, String idiomas, Long numeroDescargas) {
        this.titulo = titulo;
        this.autores = autores;
        this.idiomas = idiomas;
        this.numeroDescargas = numeroDescargas;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }
    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    public Long getNumeroDescargas() {
        return numeroDescargas;
    }
    public void setNumeroDescargas(Long numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }
    @Override
    public String toString() {
        return "Libros [titulo=" + titulo + ", autores=" + autores + ", idiomas=" + idiomas + ", numeroDescargas="
                + numeroDescargas + "]";
    }

    

    
}
