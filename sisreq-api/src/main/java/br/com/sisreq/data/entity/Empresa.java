package br.com.sisreq.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_expiracao", nullable=false)
	private Date dtExpiracao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro", nullable=false)
	private Date dtCadastro;
	
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

}
