package com.marcosmoura.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcosmoura.cursomc.domain.Categoria;
import com.marcosmoura.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursospringbootApplication implements CommandLineRunner { // esse comando e para permitir executar uma ação quando o programa for iniciado
	
	@Autowired
	private CategoriaRepository categoriaRepository; // esse comando foi colocado pois CategoriaRepository e a classe que acessa o banco de dados

	public static void main(String[] args) {
		SpringApplication.run(CursospringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica"); // colocamos null pois queremos que o Id seja gerado automaticamente
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
