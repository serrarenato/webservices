package br.com.estoque.execption;

import javax.xml.ws.WebFault;

@WebFault( targetNamespace="http://estoque.com.br/excecoes/", name="UsuarioNaoAutorizado") 
public class UsuarioNaoAutorizadoException extends Exception {

	public UsuarioNaoAutorizadoException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
