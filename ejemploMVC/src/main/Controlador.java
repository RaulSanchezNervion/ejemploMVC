package main;

import clases.Alumno;
import clases.Aula;
import menu.Menu;

/**
 * Clase principal que representa el controlador del programa.
 * Responsabilidad: Es quien se encarga de orquestar que clase actua en cada caso. 
 * Obtiene información desde el Menu(vista) para ejecutar metodos de las clases (modelo)
 * Obtiene información de las clases(modelo) para pasarselas al Menu (vista) para mostrarla.
 * 
 * 
 * El Menu (vista) nunca crea objetos del modelo (clases).
 * Las clases (modelo) nunca llama a metodos del Menu (vista)
 * Nunca el controlador, ni las clases (modelo) deben mostrar o solicitar información (No syso, ni scanner)
 * 
 * @author Raul
 *
 */
public class Controlador {

	//Metodo principal del controlador.
	public static void main(String[] args) {
		Aula aula = new Aula();//Crea un objeto inicial del aula
		String eleccion;
		do {//En funcion de la eleccion del usuario, controla que se debe hacer
			eleccion=Menu.menuPrincipal();
			switch (eleccion) {
			case "1"->addAlumno(aula);//Se quiere añadir un alumno
			case "2" -> showEstadisticas(aula);//Se quiere saber las estadisticas del aula
			}
		}while(!eleccion.equals("3"));//3 es la opcion para salir del programa
	}





	//Metodo para mostrar las estadisticas del aula por pantalla, en este caso en concreto el
	//numero de alumnos aprobados
	private static void showEstadisticas(Aula aula) {
		int numeroAprobados=aula.getNumeroAprobados();
		Menu.mostrarEstadisticas(numeroAprobados);
	}

	//Metodo utilizado ara añadir un alumno nuevo al aula
	private static void addAlumno(Aula aula) {
		String nombre=Menu.obtenerNombre();
		boolean aprobado=Menu.obtenerAprobado();
		aula.add(new Alumno(nombre,aprobado));
	}
}