package br.puc.pss.INF2125T2.repository.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Usuario;
import br.puc.pss.INF2125T2.repository.UsuarioRepository;

@Primary
@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Override
	public Usuario findByLogin(String login) {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuarios.contains(usuario)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public Usuario findByEmail(String email) {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(usuarios)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public Usuario findByLoginAndPassword(String login, String password) {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(password)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		if (usuario.getId() == 0) {
			usuario.setId(Utils.generateUniqueId());
		}
		Memoria.getInstance().getUsuarios().add(usuario);
	}

	@Override
	public Usuario findByName(String name) {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(usuarios)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public Usuario findById(int idUsuario) {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuario.getId() == idUsuario) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		List<Usuario> usuarios = Memoria.getInstance().getUsuarios();
		return usuarios;
	}
}
