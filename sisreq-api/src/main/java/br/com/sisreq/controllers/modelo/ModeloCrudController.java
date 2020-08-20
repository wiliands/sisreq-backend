package br.com.sisreq.controllers.modelo;

import org.springframework.http.ResponseEntity;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;

/**
 * Interface modelo para controller crud
 * @author wilian
 *
 * @param <ID> Tipo da chave primeira
 * @param <VO> Classe da VO que extends {@link ModeloVO}
 */
public interface ModeloCrudController<ID, VO extends ModeloVO<ID>> extends ModeloController<ID, VO> {
	
	public ResponseEntity<VO> findById(ID id);

	public ResponseEntity<?> findAll(int page, int limit, String direction);
	
	public ResponseEntity<VO> create(VO vo);
	
	public ResponseEntity<VO> update(VO vo);

	public ResponseEntity<?> delete(ID id);
	
}
