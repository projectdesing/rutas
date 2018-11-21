package rutasFinal;

public class Usuario {
	
	public String nombre;
    public String contraseña;
    public String tipoUsuario;
    public String edad;
    public String correo;



    public Usuario(String nombre, String contraseña, String tipoUsuario, String edad, String correo) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
	
}
