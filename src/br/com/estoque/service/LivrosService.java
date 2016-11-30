package br.com.estoque.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.estoque.entity.Livro;
import br.com.estoque.repository.LivroRepository;

@WebService(endpointInterface = "br.com.estoque.service.LivrosService")
public class LivrosService {
	
	@WebMethod 
	public List<Livro> listarLivros() {
		LivroRepository Livrorepositoy = new LivroRepository();
		return Livrorepositoy.listarLivros();
		}


}
