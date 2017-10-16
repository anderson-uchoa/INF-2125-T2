package br.puc.pss.INF2125T2.model.enumeration;

public enum TipoDePapel {

	ADMINISTRADOR("Administrador"), GERENTE("Gerente"), COLABORADOR("Colaborador");

	private String papel;

	private TipoDePapel(String papel) {
		this.papel = papel;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

}
