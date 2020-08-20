package br.com.sisreq.services.modelo;

import java.io.Serializable;
import java.util.List;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;
import br.com.sisreq.exceptions.ExcecaoNegocio;

/**
 * Interface modelo para services
 * @author wilian
 *
 * @param <ID> - Tipo da chave primeira
 * @param <VO> - Classe da VO que extends {@link ModeloVO}
 */
public interface ModeloService<ID, VO extends ModeloVO<ID>> extends Serializable {
	
	VO findById(ID id) throws ExcecaoNegocio;

	//public List<VO> findAll(int page, int limit, String direction);
	List<VO> findAll() throws ExcecaoNegocio;
	
	VO create(VO vo) throws ExcecaoNegocio;
	
	VO update(VO vo) throws ExcecaoNegocio;

	void delete(ID id) throws ExcecaoNegocio;

}
