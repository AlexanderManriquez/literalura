package com.aluracursos.literalura.principal;

import java.util.Scanner;

import com.aluracursos.literalura.model.DatosLibros;
import com.aluracursos.literalura.services.ConsumoAPI;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
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

        private DatosLibros getDatosLibros() {
            System.out.println("Escribe el id del libro a agregar: ");
            var idLibro = teclado.nextLine();
            var json = consumoApi.obtenerDatos(URL_BASE + idLibro);
            System.out.println(json);
            DatosLibros datos = conversor.obtenerDatos(json, DatosLibros.class);
            return datos;
    }

    private void buscarLibro() {
        
    }
}
