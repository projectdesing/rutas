package rutasFinal;

public class Usuario {
	
	public String nombre;
    public String contrase�a;
    public String tipoUsuario;
    public String edad;
    public String correo;



    public Usuario(String nombre, String contrase�a, String tipoUsuario, String edad, String correo) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.tipoUsuario = tipoUsuario;
		this.edad = edad;
		this.correo = correo;
	}
    
    

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEdad() {
		return edad;
	}



	public void setEdad(String edad) {
		this.edad = edad;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getUser() {
        return nombre;
    }

    public void setUser(String user) {
        this.nombre = user;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
	
}
