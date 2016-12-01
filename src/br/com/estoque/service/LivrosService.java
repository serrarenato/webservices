package br.com.estoque.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.estoque.entity.Livro;
import br.com.estoque.entity.Usuario;
import br.com.estoque.execption.UsuarioNaoAutorizadoException;
import br.com.estoque.repository.LivroRepository;

@WebService(endpointInterface = "br.com.estoque.service.LivrosService")
public class LivrosService {

	@WebMethod
	@WebResult(name = "livro")
	public List<Livro> listarLivros() {
		LivroRepository Livrorepositoy = new LivroRepository();
		return Livrorepositoy.listarLivros();
	}

	@RequestWrapper(className = "br.com.estoque.service.ListarLivrosPaginacao", localName = "listarLivrosPaginacao")
	@ResponseWrapper(className = "br.com.estoque.service.listarLivrosPaginacaoResponse", localName = "listarLivrosPaginacaoResponse")
	@WebResult(name = "livro")
	@WebMethod(operationName = "listarLivrosPaginacao")
	public List<Livro> listarLivros(Integer numeroDaPagina, Integer tamanhoDaPagina) {
		LivroRepository Livrorepositoy = new LivroRepository();
		return Livrorepositoy.listarLivros(numeroDaPagina, tamanhoDaPagina);
	}

	public void criarLivro(@WebParam(name = "livro") Livro livro,
			@WebParam(name = "usuario", header = true) Usuario usuario) throws UsuarioNaoAutorizadoException {
		if (usuario.getLogin().equals("soa") && usuario.getSenha().equals("soa")) {
			//Livrorepositoy.criarLivro(livro);
		} else {
			throw new UsuarioNaoAutorizadoException("Não autorizado");
		}
	}

}
