package br.com.sisreq.data.vo.v1;

import java.time.LocalDateTime;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dozermapper.core.Mapping;

import br.com.sisreq.data.vo.v1.modelo.ModeloVO;

/**
 * Classe VO de usuarios
 * @author wilian
 *
 */
public class UsuarioVO extends RepresentationModel<UsuarioVO> implements ModeloVO<Long> {
	
	private static final long serialVersionUID = 1L;

	@Mapping("idUsuario")
	@JsonProperty("idUsuario")
	private Long key;
	private String nome;
	private String nomeCompleto;
	private String login;
	private String senha;
	private boolean ativo;
	private LocalDateTime dtExpiracao;
	private boolean administrador;
	private String confirmaSenha;
	
	/**
	 * Construtor padrão
	 */
	public UsuarioVO() {
		super();
	}
	
	/**
	 * Construtor para gerar uma cópia do objeto
	 * @param usuario
	 */
	public UsuarioVO(UsuarioVO usuario) {
		this();
		this.key = usuario.getKey();
		this.nome = usuario.getNome();
		this.nomeCompleto = usuario.getNomeCompleto();
		this.administrador = usuario.isAdministrador();
		this.ativo = usuario.isAtivo();
		this.dtExpiracao = usuario.getDtExpiracao();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
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

	public LocalDateTime getDtExpiracao() {
		return dtExpiracao;
	}

	public void setDtExpiracao(LocalDateTime dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
