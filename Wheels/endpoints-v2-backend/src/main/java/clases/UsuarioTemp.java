package clases;

public class UsuarioTemp{
	
	protected String correo;
	protected String password;
	protected String nombre;
	protected String tipoUsuario;
	
	
	
	public UsuarioTemp() {
		super();
	}

	public UsuarioTemp(String correo, String password, String nombre, String tipoUsuario) {
		super();
		this.correo = correo;
		this.password = password;
		this.nombre = nombre;
		this.tipoUsuario = tipoUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
