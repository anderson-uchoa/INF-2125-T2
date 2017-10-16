package br.puc.pss.INF2125T2.model;

import java.util.ArrayList;
import java.util.List;

public class Publicacao extends ProducaoAcademica {

	private String nomeConferencia;
	private int anoPublicacao;
	private List<Colaborador> autores;
	private Projeto projeto;

	public Publicacao() {
		autores = new ArrayList<>();
	}

	public String getNomeConferencia() {
		return nomeConferencia;
	}

	public void setNomeConferencia(String nomeConferencia) {
		this.nomeConferencia = nomeConferencia;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public List<Colaborador> getAutores() {
		return autores;
	}

	public void setAutores(List<Colaborador> autores) {
		this.autores = autores;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
