package br.puc.pss.INF2125T2.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.puc.pss.INF2125T2.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	UsuarioService usuarioService;


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
	public String processForm(@RequestParam(name = "username") String user,
			@RequestParam(name = "password") String password) {

		boolean userExists = usuarioService.checkLogin(user, password);
		if (userExists) {
			return "redirect:/dashboard";
		} else {
			return "redirect:/login";
		}

	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(){
				return "dashboard";
	}

}
