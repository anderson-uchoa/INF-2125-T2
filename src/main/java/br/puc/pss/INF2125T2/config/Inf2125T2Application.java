package br.puc.pss.INF2125T2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.puc.pss.INF2125T2.ProfessorFormatter;

@SpringBootApplication
public class Inf2125T2Application  extends WebMvcConfigurerAdapter{

	@Autowired
    private ProfessorFormatter typeFormatter;
	
	@Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(typeFormatter);
     
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Inf2125T2Application.class, args);
	}
}
