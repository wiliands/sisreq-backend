package br.com.sisreq.util.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Enum de prioridades
 * @author wilian
 *
 */
public enum NivelPrioridade {
	
	BAIXA("Baixa"),
	MEDIA("Média"),
	ALTA("Alta"),
	URGENTE("Urgente");
	
	private String descricao;

	private NivelPrioridade(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	public static List<NivelPrioridade> getList() {
		return Arrays.asList(NivelPrioridade.values());
	}

}
