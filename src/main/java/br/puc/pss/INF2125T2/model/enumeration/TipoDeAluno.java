package br.puc.pss.INF2125T2.model.enumeration;

public enum TipoDeAluno {
	GRADUACAO("Graduação"), MESTRADO("Mestrado"), DOUTORADO("Doutorado");

	private String tipo;

	TipoDeAluno(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
