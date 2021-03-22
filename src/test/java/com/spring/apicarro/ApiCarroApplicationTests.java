package com.spring.apicarro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.apicarro.domain.Carro;
import com.spring.apicarro.domain.CarroService;

@SpringBootTest
class ApiCarroApplicationTests {

	@Autowired
	private CarroService service;
	
	@Test
	public void test1() {
		Carro carro = new Carro();
		carro.setNome("Ferrari");
		carro.setTipo("Esportivos");
		
		service.insert(carro);
	}

}
