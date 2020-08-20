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
import javax.persistence.Transient;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de usuarios
 * @author wilian
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario extends ModeloEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@Column(name = "nome", length=100, nullable=false)
	private String nome;
	
	@Column(name = "nome_completo", length=100, nullable=true)
	private String nomeCompleto;
	
	@Column(name = "login", length=20, nullable=false)
	private String login;
	
	@Column(name = "senha", length=50, nullable=false)
	private String senha;
	
	@Column(name = "ativo", nullable=false)
	private boolean ativo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_expiracao", nullable=false)
	private Date dtExpiracao;
	
	@Column(name = "administrador", nullable=false)
	private boolean administrador;
	
	@Transient
	private String confirmaSenha;
	
	/**
	 * Construtor padrão
	 */
	public Usuario() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param usuario
	 */
	public Usuario(Usuario usuario) {
		this();
		this.idUsuario = usuario.getIdUsuario();
		this.nome = usuario.getNome();
		this.nomeCompleto = usuario.getNomeCompleto();
		this.administrador = usuario.isAdministrador();
		this.ativo = usuario.isAtivo();
		this.dtExpiracao = usuario.getDtExpiracao();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	@Override
	public Long getId() {
		return getIdUsuario();
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
