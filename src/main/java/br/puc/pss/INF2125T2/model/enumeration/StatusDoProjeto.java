package br.puc.pss.INF2125T2.model.enumeration;

public enum StatusDoProjeto {

	EM_ELABORACAO("Em Elaboração"), EM_ANDAMENTO("Em Andamento"), CONCLUIDO("Concluído");

	private String status;

	StatusDoProjeto(String status) {
		this.status = status;

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
