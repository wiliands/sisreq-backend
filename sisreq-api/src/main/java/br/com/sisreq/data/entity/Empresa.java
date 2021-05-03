package br.com.sisreq.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de empresas
 * @author wilian
 *
 */
@Entity
@Table(name = "empresa")
public class Empresa extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresa;
	
	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	@Column(name = "dt_expiracao", nullable=false)
	private LocalDateTime dtExpiracao;
	
	@Column(name = "dt_cadastro", nullable=false)
	private LocalDateTime dtCadastro;
	
	/**
	 * Construtor padrão
	 */
	public Empresa() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param empresa
	 */
	public Empresa(Empresa empresa) {
		this();
		this.idEmpresa = empresa.getIdEmpresa();
		this.nome = empresa.getNome();
		this.ativo = empresa.isAtivo();
		this.dtExpiracao = empresa.getDtExpiracao();
		this.dtCadastro = empresa.getDtCadastro();
	}
	
	@Override
	public Long getId() {
		return getIdEmpresa();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDtExpiracao() {
		return dtExpiracao;
	}

	public void setDtExpiracao(LocalDateTime dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

}
