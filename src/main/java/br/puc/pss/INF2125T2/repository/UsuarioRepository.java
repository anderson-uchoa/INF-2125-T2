package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Usuario;

public interface UsuarioRepository {

	public void saveUsuario (Usuario usuario);
	
	public Usuario findByLogin(String login);
	
	public Usuario findByName(String name);

	public Usuario findById(int idUsuario);

	public Usuario findByEmail(String email);

	public Usuario findByLoginAndPassword(String login, String password);

	public List<Usuario> getAllUsuarios();


}
