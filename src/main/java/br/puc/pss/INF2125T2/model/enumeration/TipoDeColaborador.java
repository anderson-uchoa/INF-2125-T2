package br.puc.pss.INF2125T2.model.enumeration;

public enum TipoDeColaborador {
	ALUNO("Aluno"), PROFESSOR("Professor"), PESQUISADOR("Pesquisador");

	private String participacao;

	TipoDeColaborador(String participacao) {
		this.participacao = participacao;
	}

	public String getParticipacao() {
		return participacao;
	}

	public void setParticipacao(String participacao) {
		this.participacao = participacao;
	}

}
