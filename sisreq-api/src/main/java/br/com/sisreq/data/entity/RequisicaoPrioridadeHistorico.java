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
 * Classe de requisicao prioridade historico
 * 
 * @author wilian
 *
 */
@Entity
@Table(name = "requisicao_prioridade_hist")
public class RequisicaoPrioridadeHistorico extends ModeloEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_requisicao_prioridade_hist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRequisicaoPrioridadeHist;

	@Column(name = "dt_historico", nullable = false)
	private LocalDateTime dtContato;

	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@ManyToOne
	@JoinColumn(name = "id_prioridade", nullable = false)
	private Prioridade prioridade;

	@ManyToOne
	@JoinColumn(name = "id_requisicao", nullable = false)
	private Requisicao requisicao;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	public Long getIdRequisicaoPrioridadeHist() {
		return idRequisicaoPrioridadeHist;
	}

	public void setIdRequisicaoPrioridadeHist(Long idRequisicaoPrioridadeHist) {
		this.idRequisicaoPrioridadeHist = idRequisicaoPrioridadeHist;
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

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
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
		return getIdRequisicaoPrioridadeHist();
	}

}
