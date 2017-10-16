package br.puc.pss.INF2125T2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;

public class Projeto {

	private int id;
	private String titulo;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataTermino;
	private String agenciaFinanciadora;
	private double valorFinanciado;
	private String objetivo;
	private String descricao;
	private StatusDoProjeto statusDoProjeto;

	private List<ParticipacaoProjeto> participacaoProjetos;
	private List<Publicacao> publicacoes;

	public Projeto() {
		publicacoes = new ArrayList<>();
		participacaoProjetos = new ArrayList<>();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getAgenciaFinanciadora() {
		return agenciaFinanciadora;
	}

	public void setAgenciaFinanciadora(String agenciaFinanciadora) {
		this.agenciaFinanciadora = agenciaFinanciadora;
	}

	public double getValorFinanciado() {
		return valorFinanciado;
	}

	public void setValorFinanciado(double valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusDoProjeto getStatusDoProjeto() {
		return statusDoProjeto;
	}

	public void setStatusDoProjeto(StatusDoProjeto statusDoProjeto) {
		this.statusDoProjeto = statusDoProjeto;
	}

	public List<ParticipacaoProjeto> getParticipacaoProjetos() {
		return participacaoProjetos;
	}

	public void setParticipacaoProjetos(List<ParticipacaoProjeto> participacaoProjetos) {
		this.participacaoProjetos = participacaoProjetos;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

}
