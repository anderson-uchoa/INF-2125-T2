package br.puc.pss.INF2125T2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Usuario;
import br.puc.pss.INF2125T2.repository.UsuarioRepository;
import br.puc.pss.INF2125T2.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario getUsuarioByLogin(String login) {
		Usuario usuario = usuarioRepository.findByLogin(login);
		return usuario;
	}

	@Override
	public Usuario getUsuarioByName(String name) {
		Usuario usuario = usuarioRepository.findByName(name);
		return usuario;
	}

	@Override
	public Usuario getUsuarioById(int idUsuario) {
		Usuario usuario = usuarioRepository.findById(idUsuario);
		return usuario;

	}

	@Override
	public boolean checkLogin(String login, String senha) {
		Usuario usuario = usuarioRepository.findByLoginAndPassword(login, senha);
		if (usuario == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void saveUsuario(Usuario usuario) {

		usuarioRepository.saveUsuario(usuario);

	}

}
