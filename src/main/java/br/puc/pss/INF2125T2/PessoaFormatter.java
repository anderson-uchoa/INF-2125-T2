package br.puc.pss.INF2125T2;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;
import br.puc.pss.INF2125T2.model.Usuario;
import br.puc.pss.INF2125T2.service.UsuarioService;

@Service
public class PessoaFormatter implements Formatter<Usuario> {

	@Autowired
	UsuarioService typeService;

	@Override
	public Usuario parse(String text, Locale locale) throws ParseException {
		Integer id = Integer.valueOf(text);

		return this.typeService.getUsuarioById(id);
	}

	@Override
	public String print(Usuario object, Locale locale) {
		return null;
	}
}