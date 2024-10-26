package Logica;
import java.io.Serializable;

public abstract class Usuario implements Serializable {

	private String login;
	private String password;
	private String correo;
	private String nombre;
	private String apellido;
	//private boolean estudiante;
	
	public Usuario(String login, String password, String correo, String nombre, String apellido) {
		this.login = login;
		this.password = password;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Usuario o contraseña incorrectas.");
        }
    }

    public void logout() {
        System.out.println("Sesión cerrada.");
    }

	
}
