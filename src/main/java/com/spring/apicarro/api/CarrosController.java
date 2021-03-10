package com.spring.apicarro.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apicarro.domain.Carro;
import com.spring.apicarro.domain.CarroService;

@RestController
@RequestMapping("/api/v1/test/carros")
public class CarrosController {

	private CarroService service = new CarroService();

	@GetMapping
	public List<Carro> get() {
		return service.getCarros();
	}
}