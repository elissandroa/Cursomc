package com.elissandro.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elissandro.cursomc.domain.Categoria;
import com.elissandro.cursomc.repositories.CategoriaRepository;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
