package br.puc.pss.INF2125T2.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import br.puc.pss.INF2125T2.model.enumeration.TipoDeAluno;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeColaborador;
import br.puc.pss.INF2125T2.model.enumeration.TipoRegimeCurso;

public class Aluno extends Colaborador {

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataDeIngresso;
	private TipoRegimeCurso tipoRegimeCurso;
	private TipoDeAluno tipoAluno;
	private Professor professorOrientador;

	public Aluno() {

		setTipoDeColaborador(TipoDeColaborador.ALUNO);
	}

	public TipoRegimeCurso getTipoRegimeCurso() {
		return tipoRegimeCurso;
	}

	public void setTipoRegimeCurso(TipoRegimeCurso tipoRegimeCurso) {
		this.tipoRegimeCurso = tipoRegimeCurso;
	}

	public Date getDataDeIngresso() {
		return dataDeIngresso;
	}

	public void setDataDeIngresso(Date dataDeIngresso) {
		this.dataDeIngresso = dataDeIngresso;
	}

	public TipoDeAluno getTipoAluno() {
		return tipoAluno;
	}

	public void setTipoAluno(TipoDeAluno tipoAluno) {
		this.tipoAluno = tipoAluno;
	}

	public Professor getProfessorOrientador() {
		return professorOrientador;
	}

	public void setProfessorOrientador(Professor professorOrientador) {
		this.professorOrientador = professorOrientador;
	}

	


}
