package com.spring.apicarro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.apicarro.domain.Carro;
import com.spring.apicarro.domain.CarroService;
import com.spring.apicarro.domain.dto.CarroDTO;

@SpringBootTest
class ApiCarroApplicationTests {

	@Autowired
	private CarroService service;

	@Test
	public void testSave() {
		Carro carro = new Carro();
		carro.setNome("Ferrari");
		carro.setTipo("esportivos");

		CarroDTO c = service.insert(carro);
		assertNotNull(c);

		Long id = c.getId();
		assertNotNull(id);

		// Buscar o objeto
		Optional<CarroDTO> op = service.getCarroById(id);
		assertTrue(op.isPresent());

		c = op.get();
		assertEquals("Ferrari", c.getNome());
		assertEquals("esportivos", c.getTipo());

		// Deletar o objeto
		service.delete(id);

		// Verificar se deletou
		assertFalse(service.getCarroById(id).isPresent());
	}

	@Test
	public void testLista() {
		List<CarroDTO> carros = service.getCarros();
		assertEquals(60, carros.size());
	}

	@Test
	public void testListaPorTipo() {
		assertEquals(20, service.getCarroByTipo("esportivos").size());
		assertEquals(20, service.getCarroByTipo("classicos").size());
		assertEquals(20, service.getCarroByTipo("luxo").size());
		
		assertEquals(0, service.getCarroByTipo("x").size());
	}

	@Test
	public void testGet() {
		Optional<CarroDTO> op = service.getCarroById(11L);
		assertTrue(op.isPresent());

		CarroDTO c = op.get();
		assertEquals("Ferrari FF", c.getNome());
	}

}
