package br.com.sisreq.data.vo.v1;

import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dozermapper.core.Mapping;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;

/**
 * Classe VO de empresas
 * @author wilian
 *
 */
public class EmpresaVO extends RepresentationModel<EmpresaVO> implements ModeloVO<Long> {

	private static final long serialVersionUID = 1L;
	
	@Mapping("idEmpresa")
	@JsonProperty("idEmpresa")
	private Long key;
	private String nome;
	private boolean ativo;
	private Date dtExpiracao;
	private Date dtCadastro;

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

	public Date getDtExpiracao() {
		return dtExpiracao;
	}

	public void setDtExpiracao(Date dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
