package br.com.sisreq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de prioridades
 * @author wilian
 *
 */
@Entity
@Table(name = "prioridade")
public class Prioridade extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_prioridade")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrioridade;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "cor", length=7, nullable=false)
	private String cor;
	
	@Column(name = "nivel", length=20, nullable=false)
	private String nivel;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	/**
	 * Construtor padrão
	 */
	public Prioridade() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param prioridade
	 */
	public Prioridade(Prioridade prioridade) {
		this();
		this.idPrioridade = prioridade.getIdPrioridade();
		this.nome = prioridade.getNome();
		this.cor = prioridade.getCor();
		this.nivel = prioridade.getNivel();
		this.ativo = prioridade.isAtivo();
	}
	
	@Override
	public Long getId() {
		return getIdPrioridade();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdPrioridade() {
		return idPrioridade;
	}

	public void setIdPrioridade(Long idPrioridade) {
		this.idPrioridade = idPrioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
