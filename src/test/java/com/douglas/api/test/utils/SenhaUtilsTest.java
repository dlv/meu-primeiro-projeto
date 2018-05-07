package com.douglas.api.test.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.douglas.api.utils.SenhaUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class SenhaUtilsTest {

	@Value("${bcrypt.senha}")
	private String senha;
	
	@Test
	public void testSenhaBCrypt() {
		String senhaEncoded = SenhaUtils.gerarBCrypt(null);
		assertNull(senhaEncoded);

		senhaEncoded = SenhaUtils.gerarBCrypt(senha);
		assertTrue(SenhaUtils.senhaValida(senha, senhaEncoded));
	}
}
