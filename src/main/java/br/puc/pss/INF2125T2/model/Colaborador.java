package br.puc.pss.INF2125T2.model;

import java.util.ArrayList;
import java.util.List;

import br.puc.pss.INF2125T2.model.enumeration.TipoDeColaborador;

public class Colaborador {

	private int id;
	private String nome;
	private String email;
	private TipoDeColaborador tipoDeColaborador;
	private List<ParticipacaoProjeto> participacaoProjetos;
	private List<ProducaoAcademica> producaoAcademicas;

	public Colaborador() {
		this.participacaoProjetos = new ArrayList<ParticipacaoProjeto>();
		this.producaoAcademicas = new ArrayList<ProducaoAcademica>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoDeColaborador getTipoDeColaborador() {
		return tipoDeColaborador;
	}

	public void setTipoDeColaborador(TipoDeColaborador tipoDeColaborador) {
		this.tipoDeColaborador = tipoDeColaborador;
	}

	public List<ParticipacaoProjeto> getParticipacaoProjetos() {
		return participacaoProjetos;
	}

	public void setParticipacaoProjetos(List<ParticipacaoProjeto> participacaoProjetos) {
		this.participacaoProjetos = participacaoProjetos;
	}

	public List<ProducaoAcademica> getProducaoAcademicas() {
		return producaoAcademicas;
	}

	public void setProducaoAcademicas(List<ProducaoAcademica> producaoAcademicas) {
		this.producaoAcademicas = producaoAcademicas;
	}

}
