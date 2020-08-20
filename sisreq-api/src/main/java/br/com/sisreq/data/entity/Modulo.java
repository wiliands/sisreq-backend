package br.com.sisreq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de modulos
 * @author wilian
 *
 */
@Entity
@Table(name = "modulo")
public class Modulo extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_modulo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idModulo;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	/**
	 * Construtor padrão
	 */
	public Modulo() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param modulo
	 */
	public Modulo(Modulo modulo) {
		this();
		this.idModulo = modulo.getIdModulo();
		this.nome = modulo.getNome();
		this.ativo = modulo.isAtivo();
	}
	
	@Override
	public Long getId() {
		return getIdModulo();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Long idModulo) {
		this.idModulo = idModulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
