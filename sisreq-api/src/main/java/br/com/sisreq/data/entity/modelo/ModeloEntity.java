package br.com.sisreq.data.entity.modelo;

import java.io.Serializable;

/**
 * 
 * Classe modelo para entidades
 * @author wilian
 *
 * @param <T>
 */
public abstract class ModeloEntity<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor padrao
	 */
	public ModeloEntity() {
		super();
		setAtivo(true);
	}
	
	public abstract T getId();
	public abstract boolean isAtivo();
	public abstract void setAtivo(boolean ativo);
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		ModeloEntity<T> other = (ModeloEntity<T>) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

}
