package clases;

import java.util.ArrayList;
import java.util.Date;

public class Ruta {
	
	public ArrayList<Polilinea> puntos = new ArrayList<>();
	public Usuario usuario;
	public Date hora;
	
	public void generarRuta(){
		
	}

	public ArrayList<Polilinea> getPuntos() {
		return puntos;
	}

	public void setPuntos(ArrayList<Polilinea> puntos) {
		this.puntos = puntos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
	
}
