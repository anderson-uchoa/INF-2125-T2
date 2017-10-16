package br.puc.pss.INF2125T2.model;

import br.puc.pss.INF2125T2.model.enumeration.TipoDeOrientacao;

public class Orientacao extends ProducaoAcademica {

	private Aluno aluno;
	private Professor professor;
	private TipoDeOrientacao tipoDeOrientacao;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public TipoDeOrientacao getTipoDeOrientacao() {
		return tipoDeOrientacao;
	}

	public void setTipoDeOrientacao(TipoDeOrientacao tipoDeOrientacao) {
		this.tipoDeOrientacao = tipoDeOrientacao;
	}

}
