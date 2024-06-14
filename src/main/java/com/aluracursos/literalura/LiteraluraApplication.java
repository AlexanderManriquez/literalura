package com.aluracursos.literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.literalura.principal.Principal;
import com.aluracursos.literalura.services.ConsumoAPI;
import com.aluracursos.literalura.services.LibrosService;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{

	 @Autowired
    private ConsumoAPI consumoApi;

    @Autowired
    private LibrosService librosService;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
 	public void run(String... args) throws Exception {
 		Principal principal = new Principal(repository);
		principal.mostrarMenu();
	}
		
}
