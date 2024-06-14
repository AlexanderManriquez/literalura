package com.aluracursos.literalura.model;

import java.util.List;

public class Libros {
    int id;
    String title;
    List<Author> authors;
    List<String> languages;
    int download_count;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    public int getDownload_count() {
        return download_count;
    }
    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }
    @Override
    public String toString() {
        return "Libros [id=" + id + ", title=" + title + ", authors=" + authors + ", languages=" + languages
                + ", download_count=" + download_count + "]";
    }
    
    
    
}
