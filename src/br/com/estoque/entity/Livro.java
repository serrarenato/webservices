package br.com.estoque.entity;

import java.util.List;

public class Livro {
	private String nome;
	private List<String> autores;
	private String editora;
	private Integer anoDePublicacao;
	private String resumo;

	public Livro() {

	}

	public Livro(String nome, List<String> autores, String editora, Integer anoDePublicacao, String resumo) {
		this.nome = nome;
		this.autores = autores;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.resumo = resumo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}
