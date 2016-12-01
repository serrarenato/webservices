package br.com.estoque.main;

import javax.xml.ws.Endpoint;
import br.com.estoque.service.LivrosService;

public class Principal {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros/livros", new LivrosService()); 
		System.out.println("Serviço inicializado!");
		
		//	http://localhost:8080/livros/livros?wsdl

	}

}
