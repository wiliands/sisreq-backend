package br.com.sisreq.data.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import br.com.sisreq.data.entity.modelo.ModeloEntity;

/**
 * Classe de requisicoes
 * 
 * @author wilian
 *
 */
@Entity
@Table(name = "requisicao")
public class Requisicao extends ModeloEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_requisicao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRequisicao;

	@Column(name = "solicitante", length = 100, nullable = false)
	private String solicitante;

	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@Column(name = "concluido", nullable = false)
	private boolean concluido;

	@Column(name = "dt_solicitacao", nullable = false)
	private LocalDateTime dtSolicitacao;

	@Column(name = "dt_conclusao")
	private LocalDateTime dtConclusao;

	@Column(name = "descricao", columnDefinition = "text", nullable = false)
	private String descricao;

	@Column(name = "observacao", columnDefinition = "text")
	private String observacao;

	@Column(name = "versao", length = 100, nullable = false)
	private String versao;

	@ManyToOne
	@JoinColumn(name = "id_modulo", nullable = false)
	private Modulo modulo;

	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name = "id_posicao", nullable = false)
	private Posicao posicao;

	@ManyToOne
	@JoinColumn(name = "id_usuario_abertura", nullable = false)
	private Usuario usuarioAbertura;

	@ManyToOne
	@JoinColumn(name = "id_usuario_conclusao")
	private Usuario usuarioConclusao;

	@OneToMany(mappedBy = "requisicao")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<RequisicaoContato> lsRequisicaoContato;

	@OneToMany(mappedBy = "requisicao")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<RequisicaoPosicaoHistorico> lsRequisicaoPosicaoHistorico;

	@OneToMany(mappedBy = "requisicao")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<RequisicaoPrioridadeHistorico> lsRequisicaoPrioridadeHistorico;

	@Override
	public Long getId() {
		return getIdRequisicao();
	}

	@Override
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdRequisicao() {
		return idRequisicao;
	}

	public void setIdRequisicao(Long idRequisicao) {
		this.idRequisicao = idRequisicao;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public LocalDateTime getDtSolicitacao() {
		return dtSolicitacao;
	}

	public void setDtSolicitacao(LocalDateTime dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}

	public LocalDateTime getDtConclusao() {
		return dtConclusao;
	}

	public void setDtConclusao(LocalDateTime dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public Usuario getUsuarioAbertura() {
		return usuarioAbertura;
	}

	public void setUsuarioAbertura(Usuario usuarioAbertura) {
		this.usuarioAbertura = usuarioAbertura;
	}

	public Usuario getUsuarioConclusao() {
		return usuarioConclusao;
	}

	public void setUsuarioConclusao(Usuario usuarioConclusao) {
		this.usuarioConclusao = usuarioConclusao;
	}

	public Set<RequisicaoContato> getLsRequisicaoContato() {
		return lsRequisicaoContato;
	}

	public void setLsRequisicaoContato(Set<RequisicaoContato> lsRequisicaoContato) {
		this.lsRequisicaoContato = lsRequisicaoContato;
	}

	public Set<RequisicaoPosicaoHistorico> getLsRequisicaoPosicaoHistorico() {
		return lsRequisicaoPosicaoHistorico;
	}

	public void setLsRequisicaoPosicaoHistorico(Set<RequisicaoPosicaoHistorico> lsRequisicaoPosicaoHistorico) {
		this.lsRequisicaoPosicaoHistorico = lsRequisicaoPosicaoHistorico;
	}

	public Set<RequisicaoPrioridadeHistorico> getLsRequisicaoPrioridadeHistorico() {
		return lsRequisicaoPrioridadeHistorico;
	}

	public void setLsRequisicaoPrioridadeHistorico(
			Set<RequisicaoPrioridadeHistorico> lsRequisicaoPrioridadeHistorico) {
		this.lsRequisicaoPrioridadeHistorico = lsRequisicaoPrioridadeHistorico;
	}

}
