package com.spring.apicarro.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.spring.apicarro.domain.dto.CarroDTO;

@Service
public class CarroService {

	@Autowired
	private CarroRepository repository;

	public List<CarroDTO> getCarros() {
		return repository.findAll().stream().map(CarroDTO::new).collect(Collectors.toList());
		/*
		 * List<CarroDTO> list = new ArrayList<>();
		 * for(Carro c : carros) {
		 * 	list.add(new CarroDTO(c));
		 * }
		 * return list;
		 * */
	}

	public Optional<Carro> getCarroById(Long id) {
		return repository.findById(id);
	}

	public List<CarroDTO> getCarroByTipo(String tipo) {
		return repository.findByTipo(tipo).stream().map(CarroDTO::new).collect(Collectors.toList());
	}

	public Carro insert(Carro carro) {
		Assert.isNull(carro.getId(), "Não foi possível inserir o registro!");
		return repository.save(carro);
	}

	public Carro update(Carro carro, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		// busca o carro no banco de dados
		Optional<Carro> optional = getCarroById(id);
		if (optional.isPresent()) {
			Carro db = optional.get();
			// copiar as propriedades
			db.setNome(carro.getNome());
			db.setTipo(carro.getTipo());
			System.out.println("Carro id: " + carro.getId());

			// Atualiza p carrp
			repository.save(db);
			return db;
		} else {
			throw new RuntimeException("Não foi possível atualizar o registro!");
		}
		
		// lambda
		/*getCarroById(id).map(db -> {
			db.setNome(carro.getNome());
			db.setTipo(carro.getTipo());
			System.out.println("Carro id: " + db.getId());
			
			repository.save(db);
			return db;
		}).orElseThrow(() -> new RuntimeException("Não foi possível atualizar o registro!"));*/
	}

	public void delete(Long id) {
		Optional<Carro> carro = getCarroById(id);
		if (carro.isPresent()) {
			repository.deleteById(id);
		}
	}

}