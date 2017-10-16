package br.puc.pss.INF2125T2.model;

public class ParticipacaoProjeto {

	private int id;
	private Colaborador colaborador;
	private Projeto projeto;

	public ParticipacaoProjeto(Colaborador colaborador, Projeto projeto) {
		this.colaborador = colaborador;
		this.projeto = projeto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
