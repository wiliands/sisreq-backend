package br.com.sisreq.data.vo.v1.modelo;

import java.io.Serializable;

/**
 * 
 * Interface modelo para VOs
 * @author wilian
 *
 * @param <T>
 */
public interface ModeloVO<ID> extends Serializable {
	
	ID getKey();
	
	void setKey(ID key);

	boolean isAtivo();

	void setAtivo(boolean ativo);

}
