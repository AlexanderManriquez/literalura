package com.aluracursos.literalura.principal;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aluracursos.literalura.model.DatosLibros;
import com.aluracursos.literalura.model.Libros;
import com.aluracursos.literalura.services.ConsumoAPI;
import com.aluracursos.literalura.services.Conversor;
import com.aluracursos.literalura.services.LibrosService;

@Component
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
                            Bienvenido a Literalura

                                1 - Agregar libros
                                2 - Buscar libros por título
                                3 - Buscar libros por autor

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
                        case 2:
                                buscarLibroPorTitulo();
                                break;
                        case 3:
                                buscarLibroPorAutor();
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
    
        var json = consumoApi.obtenerDatos(URL_BASE + idLibro + "/");
    
        System.out.println("JSON recibido:");
        System.out.println(json);

        if (json == null || json.isEmpty()) {
            throw new RuntimeException("La respuesta de la API fue nula o vacía para el libro con ID: " + idLibro);
        }

        DatosLibros datos = Conversor.obtenerDatos(json, DatosLibros.class);

        if (datos == null) {
            throw new RuntimeException("No se pudieron convertir los datos del libro con ID: " + idLibro);
        }

        return datos;
    }

    private void buscarLibroPorTitulo() {
        System.out.println("Escribe el título del libro a buscar: ");
        var titulo = teclado.nextLine();

        List<Libros> librosEncontrados = librosService.buscarLibrosPorTitulo(titulo);

        if (librosEncontrados.isEmpty()) {
            System.out.println("No se encontraron libros con ese título.\n");
        } else {
            System.out.println("Libros encontrados:\n");
            for (Libros libro : librosEncontrados) {
                System.out.println(libro);
            }
        }
    }
    
    private void buscarLibroPorAutor() {
        System.out.println("Escribe el nombre del autor: ");
        var nombreAutor = teclado.nextLine();

        List<Libros> libros = librosService.buscarPorAutor(nombreAutor);
        if (libros.isEmpty()) {
            System.out.println("No se encontraron libros para el autor: " + nombreAutor);
        } else {
            System.out.println("Libros encontrados:");
            libros.forEach(System.out::println);
        }
    }

}
