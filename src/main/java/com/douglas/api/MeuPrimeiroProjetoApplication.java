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
//			System.out.println("### Quantidade de elementos por página = " + this.qtdPorPagina);
//			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
//			System.out.println("Senha encoded: " + senhaEncoded);	
//			
//			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
//			System.out.println("Senha encoded novamente: " + senhaEncoded);	
//
//			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
//			System.out.println("\n");
//			
//			Empresa empresa = new Empresa();
//			empresa.setRazaoSocial("Kazale IT");
//			empresa.setCnpj("74645215000104");
//			
//			this.empresaRepository.save(empresa);
//
//			List<Empresa> empresas = empresaRepository.findAll();
//			empresas.forEach(System.out::println);
//			
//			Empresa empresaDb = empresaRepository.findOne(1L);
//			System.out.println("Empresa por ID: " + empresaDb);
//			
//			empresaDb.setRazaoSocial("Kazale IT Web");
//			this.empresaRepository.save(empresaDb);
//
//			Empresa empresaCnpj = empresaRepository.findByCnpj("74645215000104");
//			System.out.println("Empresa por CNPJ: " + empresaCnpj);
//			
//			this.empresaRepository.delete(1L);
//			empresas = empresaRepository.findAll();
//			System.out.println("Empresas: " + empresas.size());
//			
//			this.exemploService.testarServico();
//		};
//	}
}
