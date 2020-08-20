package br.com.sisreq.exceptions;

/**
 * Classe de exceção de negócio
 * @author wilian
 *
 */
public class ExcecaoNegocio extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public ExcecaoNegocio(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ExcecaoNegocio(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ExcecaoNegocio(Throwable cause) {
		super(cause);
	}

}
