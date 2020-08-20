package br.com.sisreq.data.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de perfis
 * @author wilian
 *
 */
@Entity
@Table(name = "perfil")
public class Perfil extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_perfil")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerfil;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "permissao_perfil", joinColumns = {@JoinColumn(name = "id_perfil")}, inverseJoinColumns = {@JoinColumn(name = "id_permissao")})
	private Set<Permissao> permissaos;
	
	/**
	 * Construtor padrão
	 */
	public Perfil() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param perfil
	 */
	public Perfil(Perfil perfil) {
		this();
		this.idPerfil = perfil.getIdPerfil();
		this.nome = perfil.getNome();
		this.ativo = perfil.isAtivo();
	}
	
	@Override
	public Long getId() {
		return getIdPerfil();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Permissao> getPermissaos() {
		return permissaos;
	}

	public void setPermissaos(Set<Permissao> permissaos) {
		this.permissaos = permissaos;
	}

}
