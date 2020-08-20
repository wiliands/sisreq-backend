package br.com.sisreq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de permissoes
 * @author wilian
 *
 */
@Entity
@Table(name = "permissao")
public class Permissao extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_permissao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPermissao;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "chave", length=100, nullable=false)
	private String chave;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	/**
	 * Construtor padrão
	 */
	public Permissao() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param permissao
	 */
	public Permissao(Permissao permissao) {
		this();
		this.idPermissao = permissao.getIdPermissao();
		this.nome = permissao.getNome();
		this.chave = permissao.getChave();
		this.ativo = permissao.isAtivo();
	}
	
	@Override
	public Long getId() {
		return getIdPermissao();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

}
