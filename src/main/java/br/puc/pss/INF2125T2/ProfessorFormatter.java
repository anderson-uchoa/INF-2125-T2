package br.puc.pss.INF2125T2;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.service.ProfessorService;

@Service
public class ProfessorFormatter implements Formatter<Professor> {

    @Autowired
    ProfessorService typeService;//Service -> DB


    @Override
    public Professor parse(String text, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(text);
        
        return this.typeService.buscarProfessorPorId(id);//return Type object form DB
    }


	@Override
	public String print(Professor object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}
}