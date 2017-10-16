package br.puc.pss.INF2125T2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Inf2125T2Application  extends WebMvcConfigurerAdapter{

	
	public static void main(String[] args) {
		SpringApplication.run(Inf2125T2Application.class, args);
	}
}
