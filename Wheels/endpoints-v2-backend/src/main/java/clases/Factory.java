package clases;

import java.util.HashMap;



public class Factory {
	
	private HashMap<String, UsuarioTemp> listUsuarios = new HashMap<String, UsuarioTemp>();
	private UsuarioTemp usuario;
	
	
	public void crearUsuario() {
		usuario = new UsuarioTemp("yarethpigo@unisabana.edu.co","12345678","Yareth","Conductor");
		listUsuarios.put("yarethpigo@unisabana.edu.co", usuario);
	}
	
	
	public iUsuario listarUsuario(String correo){
		if((iUsuario) listUsuarios.get(correo) != null)
			return (iUsuario)listUsuarios.get(correo);
		return null;
	}
	
	
	
}
