package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	

	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
		
	}
	
	
    
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notifica��o %s atrav�s do e-mail %s: %s\n0",
				         cliente.getNome(),cliente.getEmail(), mensagem);
		
		
	}

	

}
