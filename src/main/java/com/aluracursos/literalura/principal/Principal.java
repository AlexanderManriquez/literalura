package com.aluracursos.literalura.principal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.aluracursos.literalura.model.DatosLibros;
import com.aluracursos.literalura.model.Libros;
import com.aluracursos.literalura.services.ConsumoAPI;
import com.aluracursos.literalura.services.Conversor;
import com.aluracursos.literalura.services.LibrosService;

public class Principal {

    @Autowired
    private ConsumoAPI consumoApi;
    @Autowired
    private LibrosService librosService;
    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/";


    public void mostrarMenu(){
        var opcion = -1;
        while (opcion != 0){
                var menu = """  
                                1 - Buscar libros

                                0 - Salir

                                Elige una opción:
                                """;
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                        case 1:
                                buscarLibro();
                                break;
                        case 0:
                                System.out.println("Cerrando la aplicación...");
                                break;
                        default:
                                System.out.println("Opción no válida");
                        }
                }
        }

    private void buscarLibro() {
        DatosLibros datos = getDatosLibros();
        Libros libro = new Libros(datos);
        librosService.guardarLibro(libro);
        System.out.println("Libro guardado: " + libro);
    }

    private DatosLibros getDatosLibros() {
        System.out.println("Escribe el id del libro a agregar: ");
        var idLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + idLibro);
        DatosLibros datos = Conversor.obtenerDatos(json, DatosLibros.class);
        return datos;
    }
}
