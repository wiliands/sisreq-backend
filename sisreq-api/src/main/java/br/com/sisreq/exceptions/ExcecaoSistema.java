package br.com.sisreq.exceptions;

/**
 * Classe de exceção de sistema
 * @author wilian
 *
 */
public class ExcecaoSistema extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public ExcecaoSistema(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ExcecaoSistema(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ExcecaoSistema(Throwable cause) {
		super(cause);
	}

}
