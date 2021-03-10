package com.spring.apicarro.domain;

import java.util.ArrayList;
import java.util.List;

public class CarroService {

	public List<Carro> getCarros() {
		List<Carro> carros = new ArrayList<>();
 		carros.add(new Carro(1L, "Fusca"));
 		carros.add(new Carro(2L, "Celta"));
 		carros.add(new Carro(3L, "Corsa"));
		return carros; 
	}
	
}