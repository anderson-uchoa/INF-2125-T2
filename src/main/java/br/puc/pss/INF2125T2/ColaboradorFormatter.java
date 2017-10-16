package br.puc.pss.INF2125T2;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.service.ColaboradorService;

@Service
public class ColaboradorFormatter implements Formatter<Colaborador> {

	@Autowired
	ColaboradorService typeService;

	@Override
	public Colaborador parse(String text, Locale locale) throws ParseException {
		Integer id = Integer.valueOf(text);

		return this.typeService.getColaboradorPorId(id);
	}

	@Override
	public String print(Colaborador object, Locale locale) {
		return null;
	}

}