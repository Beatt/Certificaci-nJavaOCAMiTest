
// Importamos todos métodos de la clase Assert...
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Cuando importamos los miembros de una clase
 * 	estos deben ser static ya que si no, nos enviara
 * 	un mensaje de error de compilación
 * 
 *  La sintaxis es clara
 *  	import static paquete.clasex.miembros;
 *  Nos dice que importe todos los miembros static del paquete de
 *  	la clasex.
 */


// Importando todos los miembros de la clase Perro
//import static animal.Perro.*;

// Importando el atributo nombre de la clase Perro
//import static animal.Perro.nombre;


// Importando el método getNombre de la clase Perro
import static animal.Perro.getNombre;

public class Import {
	
	@Test
	public void importMethod() 
	{
		
		// Importación del método de la clase Assert...
		assertEquals(3, 3);
		
		assertEquals("Chiquito", getNombre());
		
	}
	
	
	
	public void importClasesDelMismoNombre() 
	{
		
		// De está forma podemos incluir dos instancias de una clase
		// con el mismo nombre
		java.sql.Date dateSql = new java.sql.Date(2030232L);
		java.util.Date dateUtil = new java.util.Date();
		
		
		// Ya que si las importamos como normalmente se realiza a la 
		// hora de instanciar la clase Date tomara la clase del 
		// primer paquete que encuentre de arriba hacia abajo
		// pero esto solo aplica de la siguiente forma
		//	import java.sql.Date.*;
		//	import java.util.Date.*;
		// aquí tomara la clase Date del subpaquete sql
		// sin enviar error de compilación, ahora si lo hacemos 
		// de la siguiente manera, nos enviara error de compilación
		// 	import java.sql.Date;
		//	import java.util.Date;
		
		
	}
}
