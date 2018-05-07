package com.douglas.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

//	@Autowired
//	private EmpresaRepository empresaRepository;
//
//	@Autowired
//	private ExemploService exemploService;
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			System.out.println("\n");
//			System.out.println("Meu primeiro projeto");
//			
//			this.exemploService.testarServico();
//		};
//	}
}
