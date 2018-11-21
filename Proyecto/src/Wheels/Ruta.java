package Wheels;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ruta implements Componente {
	private String nombre;
	private String fecha;
	private String hora;
	private int asientos;
	private boolean estado;
	private String idConductor;
	private ArrayList<Componente> componentes;

	public Ruta(String nombre, String fecha, String hora, int asientos, boolean estado, String idConductor) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.asientos = asientos;
		this.estado = estado;
		this.idConductor = idConductor;
		setComponentes(new ArrayList<>());
	}

	public Ruta(String idConductor) {
		this.idConductor = idConductor;
		setComponentes(new ArrayList<>());

	}

	public String getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void add(Componente c) {
		getComponentes().add(c);
	}

	@Override
	public String getValores() {
		JOptionPane.showMessageDialog(null,
				"La ruta " + nombre + "\nCon " + asientos+ " asientos" + "\nProgramada para "
						+ fecha + "\nCon hora de partida " + hora);
		for (Componente c : componentes)
			c.getValores();
		return null;
	}

	@Override
	public void SetValores(String adicional) {
		// TODO Auto-generated method stub
		
	}

	
}
