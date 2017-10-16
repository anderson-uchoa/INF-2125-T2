package br.puc.pss.INF2125T2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeColaborador;
import br.puc.pss.INF2125T2.service.AlunoService;
import br.puc.pss.INF2125T2.service.ColaboradorService;
import br.puc.pss.INF2125T2.service.OrientacaoService;
import br.puc.pss.INF2125T2.service.PesquisadorService;
import br.puc.pss.INF2125T2.service.ProfessorService;
import br.puc.pss.INF2125T2.service.ProjetoService;
import br.puc.pss.INF2125T2.service.PublicacaoService;

@Controller
@RequestMapping("/producao")
public class ProducaoAcademicaController {

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private ProfessorService professorService;

	@Autowired
	private ColaboradorService colaboradorService;

	@Autowired
	private PublicacaoService publicacaoService;

	@Autowired
	private OrientacaoService orientacaoService;

	@Autowired
	private PesquisadorService pesquisadorService;

	@Autowired
	private ProjetoService projetoService;

	@RequestMapping(value = "/adicionarOrientacao", method = RequestMethod.GET)
	public String adicionarOrientacao(Model model) {

		model.addAttribute("orientacao", new Orientacao());
		model.addAttribute("professores", professorService.listarTodosProfessores());
		model.addAttribute("alunos", alunoService.getAllAlunos());

		return "form_add_orientacao";
	}

	@RequestMapping(value = "/adicionarNovoOrientacao", method = RequestMethod.POST)
	public String adicionarNovaOrientacao(Orientacao orientacao, Model model) {
		orientacaoService.addOrientacao(orientacao);

		return "redirect:/dashboardProducaoAcademica";
	}

	@RequestMapping(value = "/adicionarPublicacao", method = RequestMethod.GET)
	public String adicionarPublicacao(Model model) {

		model.addAttribute("publicacao", new Publicacao());

		model.addAttribute("colaboradores", colaboradorService.getAllColaboradores());

		model.addAttribute("projetos", projetoService.listarProjetoEmAndamento());

		return "form_add_publicacao";
	}

	@RequestMapping(value = "/adicionarNovaPublicacao", method = RequestMethod.POST)
	public String adicionarNovaPublicacao(Publicacao publicacao, Model model) {

		List<Colaborador> autores = new ArrayList<Colaborador>();

		for (Colaborador colaborador : publicacao.getAutores()) {
			if (colaborador.getTipoDeColaborador().equals(TipoDeColaborador.ALUNO)) {
				// publicacao.getAutores().add(alunoService.getAlunoById(colaborador.getId()));
				autores.add(alunoService.getAlunoById(colaborador.getId()));
			} else if (colaborador.getTipoDeColaborador().equals(TipoDeColaborador.PROFESSOR)) {
				// publicacao.getAutores().add(professorService.buscarProfessorPorId(colaborador.getId()));
				autores.add(professorService.buscarProfessorPorId(colaborador.getId()));
			} else {
				// publicacao.getAutores().add(professorService.buscarProfessorPorId(colaborador.getId()));

				autores.add(pesquisadorService.getPesquisadorById((colaborador.getId())));
			}
		}

		publicacao.getAutores().clear();
		publicacao.setAutores(autores);

		if (publicacao.getProjeto() != null) {
			publicacao.getProjeto().getPublicacoes().add(publicacao);

		}

		publicacaoService.cadastrarPublicacao(publicacao);

		return "redirect:/dashboardProducaoAcademica";
	}

}
