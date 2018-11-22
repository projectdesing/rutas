package clases;

public abstract class Usuario implements iUsuario{
	
	protected String correo;
	protected String password;
	protected String nombre;
	protected String tipoUsuario;
	
	
	public abstract String crear(String correo, String contrasena, String nombre, String tipoUsuario);
	public abstract String consultar(String correo);
	
	@Override
	public String getCorreo() {
		return correo;
	}
	@Override
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	@Override
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
