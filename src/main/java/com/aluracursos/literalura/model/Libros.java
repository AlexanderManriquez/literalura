package com.aluracursos.literalura.model;

import java.util.List;

public class Libros {
    int id;
    String titulo;
    List<Autor> autor;
    List<String> idiomas;
    int descargas;

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
    public int getDescargas() {
        return descargas;
    }
    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }
    
    @Override
    public String toString() {
        return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", idiomas=" + idiomas + ", descargas="
                + descargas + "]";
    }

    

    
    
    
    
    
}
