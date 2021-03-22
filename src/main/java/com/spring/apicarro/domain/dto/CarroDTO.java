package com.spring.apicarro.domain.dto;

import org.modelmapper.ModelMapper;

import com.spring.apicarro.domain.Carro;

import lombok.Data;

@Data
public class CarroDTO {

	private Long id;
	private String nome;
	private String tipo;
	
	// gera um carro DTO apartir de Carro
	public static CarroDTO create(Carro c) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(c, CarroDTO.class);
	}
}