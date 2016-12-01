package br.com.estoque.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.estoque.entity.Livro;

public class LivroRepository {
	List<Livro> listLivros;
	public LivroRepository() {
		listLivros = new ArrayList<Livro>();
		List<String> autores = new ArrayList<String>();
		autores.add("Machado de Assis");
		autores.add("Stephen King");
		autores.add("Renato Serra");
		Livro livro = new Livro("Anjos da Noite", autores, "Etica", 1190, "Livro de Vampiros");
		Livro livro1 = new Livro("O Apanhador de Sonhos", autores, "Etica", 1990, "Livro de Terror Alienigena");
		Livro livro2 = new Livro("Senhor dos Aneis", autores, "Renascenša", 1890, "Livro de Fantasia medieval");
		listLivros.add(livro);
		listLivros.add(livro1);
		listLivros.add(livro2);
	}
	public List<Livro> listarLivros() {
		return listLivros;
		
	}
	public List<Livro> listarLivros(Integer numeroDaPagina, Integer tamanhoDaPagina) {
		List<Livro> listLivrosResult;
		listLivrosResult = new ArrayList<Livro>();
		int x=1;
		for (Livro livro:listLivros){
			if (x>tamanhoDaPagina)
				break;
			listLivrosResult.add(livro);
			x++;
		}
		return listLivrosResult;
		
	}

}
