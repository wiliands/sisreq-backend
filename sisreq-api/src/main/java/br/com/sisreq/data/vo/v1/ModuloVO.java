package br.com.sisreq.data.vo.v1;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dozermapper.core.Mapping;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;

/**
 * Classe VO de modulos
 * @author wilian
 *
 */
public class ModuloVO extends RepresentationModel<ModuloVO> implements ModeloVO<Long> {

	private static final long serialVersionUID = 1L;

	@Mapping("idModulo")
	@JsonProperty("idModulo")
	private Long key;
	private String nome;
	private boolean ativo;

	@Override
	public Long getKey() {
		return key;
	}

	@Override
	public void setKey(Long key) {
		this.key = key;
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
