package br.com.sisreq.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de requisicao posicao historico
 * 
 * @author wilian
 *
 */
@Entity
@Table(name = "requisicao_posicao_hist")
public class RequisicaoPosicaoHistorico extends ModeloEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_requisicao_posicao_hist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRequisicaoPosicaoHist;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_historico", nullable = false)
	private Date dtContato;

	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@ManyToOne
	@JoinColumn(name = "id_posicao", nullable = false)
	private Posicao posicao;

	@ManyToOne
	@JoinColumn(name = "id_requisicao", nullable = false)
	private Requisicao requisicao;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	public Long getIdRequisicaoPosicaoHist() {
		return idRequisicaoPosicaoHist;
	}

	public void setIdRequisicaoPosicaoHist(Long idRequisicaoPosicaoHist) {
		this.idRequisicaoPosicaoHist = idRequisicaoPosicaoHist;
	}

	public Date getDtContato() {
		return dtContato;
	}

	public void setDtContato(Date dtContato) {
		this.dtContato = dtContato;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
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
		return getIdRequisicaoPosicaoHist();
	}

}
