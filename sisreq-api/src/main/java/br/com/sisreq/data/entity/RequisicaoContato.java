package br.com.sisreq.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de requisicao contato
 * 
 * @author wilian
 *
 */
@Entity
@Table(name = "requisicao_contato")
public class RequisicaoContato extends ModeloEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_requisicao_contato")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRequisicaoContato;

	@Column(name = "dt_contato", nullable = false)
	private LocalDateTime dtContato;

	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@Column(name = "contato", length = 100)
	private String contato;

	@Column(name = "descricao", columnDefinition = "text")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "id_requisicao", nullable = false)
	private Requisicao requisicao;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	public Long getIdRequisicaoContato() {
		return idRequisicaoContato;
	}

	public void setIdRequisicaoContato(Long idRequisicaoContato) {
		this.idRequisicaoContato = idRequisicaoContato;
	}

	public LocalDateTime getDtContato() {
		return dtContato;
	}

	public void setDtContato(LocalDateTime dtContato) {
		this.dtContato = dtContato;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public Long getId() {
		return getIdRequisicaoContato();
	}

}
