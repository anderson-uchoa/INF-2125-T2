package br.puc.pss.INF2125T2.model.enumeration;

public enum TipoRegimeCurso {
	INTEGRAL("Integral"), PARCIAL("Parcial"), NAO_SE_APLICA("Não se aplica");

	private String regime;

	TipoRegimeCurso(String regime) {
		this.regime = regime;

	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

}
