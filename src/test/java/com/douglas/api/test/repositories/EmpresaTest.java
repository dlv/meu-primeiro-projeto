package com.douglas.api.test.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.douglas.api.entities.Empresa;
import com.douglas.api.repositories.EmpresaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EmpresaTest {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Test
	public void testCRUD() {
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Kazale IT");
		empresa.setCnpj("74645215000104");

		this.empresaRepository.save(empresa);

		List<Empresa> empresas = empresaRepository.findAll();
		
		assertNotNull(empresas);
		assertEquals(1, empresas.size());
		assertEquals("Kazale IT", empresas.get(0).getRazaoSocial());
		assertEquals("74645215000104", empresas.get(0).getCnpj());

		Empresa empresaDb = empresaRepository.findOne(1L);
		assertNotNull(empresaDb);
		// assertEquals(expected, actual);
		assertEquals("Kazale IT", empresaDb.getRazaoSocial());
		assertEquals("74645215000104", empresaDb.getCnpj());
		
		Empresa empresaCnpj = empresaRepository.findByCnpj("74645215000104");
		assertNotNull(empresaCnpj);
		assertEquals("Kazale IT", empresaCnpj.getRazaoSocial());
		assertEquals("74645215000104", empresaCnpj.getCnpj());

		this.empresaRepository.delete(1L);
		empresas = empresaRepository.findAll();
		assertEquals(0, empresas.size());
	}
}
