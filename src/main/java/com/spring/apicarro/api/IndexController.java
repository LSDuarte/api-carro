package com.spring.apicarro.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String get() {
		return "Get Spring Boot";
	}
	
	// aprendendo a passar parametro sem aparecer os parametros na URL, com POST [http://localhost:8080/login] passando User e Pass via Postman
	@PostMapping("/login")
	public String login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		return "Login: " + user + ", Senha: " + pass;
	}
	
	// aprendendo a passar parametro [http://localhost:8080/loginParam?user=larissa&pass=123]
	@GetMapping("/loginParam")
	public String loginParam(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		return "Login: " + user + ", Senha: " + pass;
	}
	
	// aprendendo a passar variaveis [http://localhost:8080/loginVariable/larissa/senha/123]
	@GetMapping("/loginVariable/{user}/senha/{pass}")
	public String loginVariable(@PathVariable("user") String user, @PathVariable("pass") String pass) {
		return "Login: " + user + ", Senha: " + pass;
	}
	
	// lidando com rotas
	@GetMapping("/carros/{id}")
	public String getCarroById(@PathVariable("id") Long id) {
		return "Carro by id " + id;
	}
	
	@GetMapping("/carros/tipo/{tipo}")
	public String getCarroByTipo(@PathVariable("tipo") String tipo) {
		return "Lista de Carros " + tipo;
	}

}