package br.puc.pss.INF2125T2.model.enumeration;

public enum TipoDeOrientacao {
	TRABALHO_CONCLUSAO_CURSO("Trabalho de Conclusão de Curso"), DISSERTACAO("Dissertação"), TESE("Tese");

	private String tipo;

	TipoDeOrientacao(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
