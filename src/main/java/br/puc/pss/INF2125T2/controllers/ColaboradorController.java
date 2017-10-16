package br.puc.pss.INF2125T2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.model.Pesquisador;
import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeColaborador;
import br.puc.pss.INF2125T2.service.AlunoService;
import br.puc.pss.INF2125T2.service.OrientacaoService;
import br.puc.pss.INF2125T2.service.PesquisadorService;
import br.puc.pss.INF2125T2.service.ProfessorService;
import br.puc.pss.INF2125T2.service.PublicacaoService;

@Controller
@RequestMapping("/colaborador")
public class ColaboradorController {

	@Autowired
	private ProfessorService professorService;

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private PesquisadorService pesquisadorService;

	@Autowired
	private PublicacaoService publicacaoService;

	@Autowired
	private OrientacaoService orientacaoService;

	@RequestMapping(value = "/adicionarAluno", method = RequestMethod.GET)
	public String adicionarAluno(Model model) {
		model.addAttribute("aluno", new Aluno());
		model.addAttribute("professores", professorService.listarTodosProfessores());

		return "form_add_aluno";
	}

	@RequestMapping(value = "/adicionarProfessor", method = RequestMethod.GET)
	public String adicionarProfessor(Model model) {
		model.addAttribute("professor", new Professor());

		return "form_add_professor";
	}

	@RequestMapping(value = "/adicionarPesquisador", method = RequestMethod.GET)
	public String adicionarPesquisador(Model model) {
		model.addAttribute("pesquisador", new Pesquisador());

		return "form_add_pesquisador";
	}

	@RequestMapping(value = "/adicionarPesquisadorNovo", method = RequestMethod.POST)
	public String adicionarNovoPesquisador(Pesquisador pesquisador, Model model) {

		pesquisadorService.addPesquisador(pesquisador);

		return "redirect:/dashboardColaborador";
	}

	@RequestMapping(value = "/adicionarAlunoNovo", method = RequestMethod.POST)
	public String adicionarNovoAluno(Aluno aluno, Model model) {

		alunoService.adicionarAluno(aluno);

		return "redirect:/dashboardColaborador";
	}

	@RequestMapping(value = "/adicionarProfessorNovo", method = RequestMethod.POST)
	public String adicionarNovoProfessor(Professor professor, Model model) {

		professorService.addProfessor(professor);

		return "redirect:/dashboardColaborador";
	}

	@RequestMapping(value = "/publicacoesDoColaborador/{idColaborador}/{tipoColaborador}", method = RequestMethod.GET)
	public String verPublicacoesDoColaborador(@PathVariable int idColaborador, @PathVariable String tipoColaborador,
			Model model) {

		Colaborador colaborador = null;
		List<Orientacao> orientacoes = null;

		if (tipoColaborador.equals(TipoDeColaborador.ALUNO.getParticipacao())) {
			colaborador = alunoService.getAlunoById(idColaborador);

		} else if (tipoColaborador.equals(TipoDeColaborador.PROFESSOR.getParticipacao())) {
			colaborador = professorService.buscarProfessorPorId(idColaborador);
			orientacoes = orientacaoService.buscarOrientacaoPorProfessor(idColaborador);

		} else {
			colaborador = pesquisadorService.getPesquisadorById(idColaborador);
		}

		List<Publicacao> publicacoes = publicacaoService.getPublicacaosPorColaborador(colaborador.getId());

		model.addAttribute("publicacoes", publicacoes);

		model.addAttribute("orientacoes", orientacoes);

		model.addAttribute("colaborador", colaborador);

		return "ver_publicacoes_colaborador";

	}

}