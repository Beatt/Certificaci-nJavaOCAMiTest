import static org.junit.Assert.*;

import org.junit.Test;

public class ModificadoresNoAcceso {
	
	/*
	 * Clase: No se permite heredar de ella
	 * 		Sus métodos son implicitamente finales todos.
	 * 		Termina una cadena de herencia.
	 * 		Para que los programadores no puedan heredar
	 * 			y pasen por alto restricciones de seguridad.
	 * 		El compilador es más eficiente ya que no tiene que buscar
	 * 			estás clases o métodos cuando se este tratando con clases
	 * 			heredadas. 
	 * 
	 * Atributos: Su valor permanece constante
	 * 		No puede cambiar el valor una vez asignado. 
	 * 
	 * Método: No se puede heredar.
	 * 
	 * Podemos utilizar final en 
	 * 		- Variables de instancia
	 * 		- Variables locales
	 * 		- Variables de parametros
	 * 		- Variables de clase 		
	 */
	
	@Test
	public void modificarFinal() {
		
		final Animal animal = new Animal();
		assertNotNull(animal);
		
		assertEquals("Chiquito", animal.nombre);
		
		// No se puede reasignar un nuevo valor
		//	manda error de compilación
		//animal.nombre = "Goku";
		
		// No se puede reasignar...
		//animal = new Animal();
		
	}

}

final class Animal {
	
	public final String nombre;

	public Animal() {
		nombre = "Chiquito";
	}
	
	public final String miMetodo(final int miVariable) {
		return "Este método no se puede heredar";
	}
	
}