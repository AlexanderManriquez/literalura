package com.aluracursos.literalura.model;

public class Autor {
    String nombre;
    int fechaNacimiento;
    int fechaFallecimiento;

    public Autor(String nombre, int fechaNacimiento, int fechaFallecimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public void setFechaFallecimiento(int fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }

    @Override
    public String toString() {
        return "Autor [nombre= " + nombre + ", fechaNacimiento= " + fechaNacimiento + ", fechaFallecimiento= "
                + fechaFallecimiento + "]";
    }
   
}
