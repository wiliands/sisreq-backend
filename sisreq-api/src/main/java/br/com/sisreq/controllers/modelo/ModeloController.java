package br.com.sisreq.controllers.modelo;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.hateoas.Link;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;

/**
 * Interace modelo para controller
 * @author wilian
 *
 * @param <ID> Tipo da chave primeira
 * @param <VO> Classe da VO que extends {@link ModeloVO}
 */
public interface ModeloController<ID, VO extends ModeloVO<ID>> extends Serializable {
	
	Link buildLink(ID id);
	
	default Sort sortDirection(String direction, String fieldName) {
		var sortDirection = StringUtils.isBlank(direction) || "desc".equalsIgnoreCase(direction) ? Direction.DESC : Direction.ASC;
		return Sort.by(sortDirection, fieldName);
	}

}
