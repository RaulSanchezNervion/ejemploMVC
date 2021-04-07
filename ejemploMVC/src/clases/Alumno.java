package clases;

/**
 * Clase para representar una persona. Forma parte del Modelo de
 * la aplicación.
 * 
 * @author Raul
 *
 */
public class Alumno {
	private String nombre;
	private boolean aprobado;

	
	public Alumno(String nombre, boolean aprobado) {
		super();
		this.nombre = nombre;
		this.aprobado = aprobado;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
