package br.puc.pss.INF2125T2.service;



import br.puc.pss.INF2125T2.model.Usuario;

public interface UsuarioService{

	
	public Usuario getUsuarioByLogin(String login);

	public Usuario getUsuarioByName(String name);

	public Usuario getUsuarioById(int idUsuario);

	public boolean checkLogin(String login, String senha);

	public void saveUsuario(Usuario usuario);
	
	
	
}
