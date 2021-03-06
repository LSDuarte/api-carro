package com.spring.apicarro.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.spring.apicarro.api.exception.ObjectNotFoundException;
import com.spring.apicarro.domain.dto.CarroDTO;

@Service
public class CarroService {

	@Autowired
	private CarroRepository repository;

	public List<CarroDTO> getCarros() {
		return repository.findAll().stream().map(CarroDTO::create).collect(Collectors.toList());
	}

	public CarroDTO getCarroById(Long id) {
		return repository.findById(id).map(CarroDTO::create).orElseThrow(() -> new ObjectNotFoundException("Carro não encontrado."));
	}

	public List<CarroDTO> getCarroByTipo(String tipo) {
		return repository.findByTipo(tipo).stream().map(CarroDTO::create).collect(Collectors.toList());
	}

	public CarroDTO insert(Carro carro) {
		Assert.isNull(carro.getId(), "Não foi possível inserir o registro!");
		return CarroDTO.create(repository.save(carro));
	}

	public CarroDTO update(Carro carro, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		// busca o carro no banco de dados
		Optional<Carro> optional = repository.findById(id);
		if (optional.isPresent()) {
			Carro db = optional.get();
			// copiar as propriedades
			db.setNome(carro.getNome());
			db.setTipo(carro.getTipo());
			System.out.println("Carro id: " + carro.getId());

			// Atualiza o carro
			repository.save(db);
			return CarroDTO.create(db);
		} else {
			return null;
		}
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}