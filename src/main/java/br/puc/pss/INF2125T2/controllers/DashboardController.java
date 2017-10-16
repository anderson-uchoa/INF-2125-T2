package br.puc.pss.INF2125T2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.model.RelatorioProducaoAcademica;
import br.puc.pss.INF2125T2.service.ColaboradorService;
import br.puc.pss.INF2125T2.service.OrientacaoService;
import br.puc.pss.INF2125T2.service.ProjetoService;
import br.puc.pss.INF2125T2.service.PublicacaoService;
import br.puc.pss.INF2125T2.service.RelatorioService;

@Controller
public class DashboardController {

	@Autowired
	private ProjetoService projetoService;

	@Autowired
	private ColaboradorService colaboradorService;

	@Autowired
	private PublicacaoService publicacaoService;

	@Autowired
	private OrientacaoService orientacaoService;

	@Autowired
	private RelatorioService relatorioService;

	
	@RequestMapping(value = "/dashboardProjeto", method = RequestMethod.GET)
	public String inicializarDashboardProjeto(Model model) {

		List<Projeto> allProjetos = projetoService.getAllProjetos();
		model.addAttribute("projetos", allProjetos);
		return "dashboard_projeto";

	}

	@RequestMapping(value = "/dashboardColaborador", method = RequestMethod.GET)
	public String inicializarDashboardColaborador(Model model) {

		List<Colaborador> colaboradores = colaboradorService.getAllColaboradores();

		model.addAttribute("colaboradores", colaboradores);

		return "dashboard_colaborador";

	}

	@RequestMapping(value = "/dashboardProducaoAcademica", method = RequestMethod.GET)
	public String inicializarDashboardProducaoAcademica(Model model) {
		List<Publicacao> publicacoes = publicacaoService.listarPublicacoes();
		List<Orientacao> orientacoes = orientacaoService.listarTodasOrientacoes();

		model.addAttribute("publicacoes", publicacoes);
		model.addAttribute("orientacoes", orientacoes);

		return "dashboard_producao_academica";

	}

	
	@RequestMapping(value = "/dashboardRelatorioProducaoAcademica", method = RequestMethod.GET)
	public String inicializarDashboardRelatorioProducaoAcademica(Model model) {
		
		RelatorioProducaoAcademica relatorio = relatorioService.getRelatorio();
		
		model.addAttribute("relatorio", relatorio);

		return "dashboard_relatorio";

	}

	
	
	
	
	
	
}
