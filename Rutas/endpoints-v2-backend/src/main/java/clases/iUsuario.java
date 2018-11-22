package clases;

public interface iUsuario{
	public abstract String crear(String correo, String contrasena, String nombre, String tipoUsuario);
	public abstract String consultar(String correo);
	public String getCorreo();
	public void setCorreo(String correo);
	public String getPassword();
	public void setPassword(String password);
	public String getNombre();
	public void setNombre(String nombre);
	public String getTipoUsuario();
	public void setTipoUsuario(String tipoUsuario);
}
