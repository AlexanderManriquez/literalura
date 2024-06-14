package com.aluracursos.literalura.model;

import java.util.List;

public class Libros {
    int id;
    String titulo;
    List<Autor> autor;
    List<String> idiomas;
    int numeroDescargas;

    public Libros (){}
    
    public Libros(DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.autor = datosLibros.autores();
        this.idiomas = datosLibros.idiomas();
        this.numeroDescargas = datosLibros.numeroDescargas().intValue();  // Convierta Long a int
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutor() {
        return autor;
    }
    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
    
    public int getNumeroDescargas() {
        return numeroDescargas;
    }
    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", idiomas=" + idiomas
                + ", numeroDescargas=" + numeroDescargas + "]";
    } 
}
