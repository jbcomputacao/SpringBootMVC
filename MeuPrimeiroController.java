package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	String pessoa;
	

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
		
	}
	@GetMapping("/hello")
	@ResponseBody
	public String hello(){
		
		Cliente joao = new Cliente("Joao", "joao@xyz.com", "713303-6151");
		

	     ativacaoClienteService.ativar(joao);
	     return "Voltando ao java com Spring Boot";
	


	
	
		
	}
	
	

}
