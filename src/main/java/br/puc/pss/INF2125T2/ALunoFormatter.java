package br.puc.pss.INF2125T2;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.service.AlunoService;

@Service
public class ALunoFormatter implements Formatter<Aluno> {

	@Autowired
	AlunoService typeService;

	@Override
	public Aluno parse(String text, Locale locale) throws ParseException {
		Integer id = Integer.valueOf(text);

		return this.typeService.getAlunoById(id);
	}

	@Override
	public String print(Aluno object, Locale locale) {

		return null;
	}
}