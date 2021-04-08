package com.spring.apicarro.api;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.apicarro.domain.Carro;
import com.spring.apicarro.domain.CarroService;
import com.spring.apicarro.domain.dto.CarroDTO;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

	@Autowired
	private CarroService service;

	@GetMapping
	public ResponseEntity<List<CarroDTO>> get() {
		return ResponseEntity.ok(service.getCarros());
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/{id}")
	public ResponseEntity get(@PathVariable("id") Long id) {
		CarroDTO c = service.getCarroById(id);
		return ResponseEntity.ok(c);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/tipo/{tipo}")
	public ResponseEntity getCarrosByTipo(@PathVariable("tipo") String tipo) {
		List<CarroDTO> carros = service.getCarroByTipo(tipo);
		return carros.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(carros);
	}

	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity post(@RequestBody Carro carro) {
		CarroDTO c = service.insert(carro);
		URI location = getUri(c.getId());
		return ResponseEntity.created(location).build();
	}

	private URI getUri(Long id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/{id}")
	public ResponseEntity put(@PathVariable("id") Long id, @RequestBody Carro carro) {
		carro.setId(id);
		CarroDTO c = service.update(carro, id);
		return c != null ? ResponseEntity.ok(c) : ResponseEntity.notFound().build();
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}

}