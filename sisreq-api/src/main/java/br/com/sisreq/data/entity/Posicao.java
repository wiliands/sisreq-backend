package br.com.sisreq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de posicoes
 * @author wilian
 *
 */
@Entity
@Table(name = "posicao")
public class Posicao extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_posicao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPosicao;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	/**
	 * Construtor padrão
	 */
	public Posicao() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param posicao
	 */
	public Posicao(Posicao posicao) {
		this();
		this.idPosicao = posicao.getIdPosicao();
		this.nome = posicao.getNome();
		this.ativo = posicao.isAtivo();
	}
	
	@Override
	public Long getId() {
		return getIdPosicao();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdPosicao() {
		return idPosicao;
	}

	public void setIdPosicao(Long idPosicao) {
		this.idPosicao = idPosicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
