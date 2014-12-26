import static org.junit.Assert.*;

import org.junit.Test;

public class StringBuilderTest 
{
	
	@Test
	public void testInicialización() 
	{
		StringBuilder sb0 = null;
		assertNull(sb0);
		
		// La longitud por default es de 16
		StringBuilder sb1 = new StringBuilder();		
		assertNotNull(sb1);
		assertEquals(16, sb1.capacity());

		StringBuilder sb2 = new StringBuilder("The crystal method");
		assertNotNull(sb2);
		assertEquals(34, sb2.length() + 16);
		
		// Recibi un caracter el cual corresponde 
		// al método sobrecargado de int
		// el cual determina la capacidad que debe tener
		StringBuilder sb3 = new StringBuilder('a');
		assertNotNull(sb3);
		assertEquals(97, sb3.capacity());
		
		// No puede recibir un arreglo de 
		// caracteres, manda error de compilación
//		char arrayChar[] = {
//				'N',
//				'o',
//				's',
//				'e'
//		};
		// Determinamos la longitud que va tener
		StringBuilder sb4 = new StringBuilder(5);
		assertEquals(5, sb4.capacity());
		
	}	
	
	@Test
	public void testMetodoAppend() 
	{
		StringBuilder sb1 = new StringBuilder();		
		assertNotNull(sb1);
		sb1.append("Crystal Method Fucking Rules");
		assertEquals("Crystal Method Fucking Rules", sb1.toString());
		
		StringBuilder sb2 = new StringBuilder("The crystal method");
		assertNotNull(sb2);
		
		// No puede asignar un tipo de dato que no se un String
		// cuando estamos icializando el objeto
		//boolean dato = false;
		StringBuilder sb3 = new StringBuilder();
		// Atraves de append podemos pasarle cualquier tipo de dato
		// primitivo como objetos
		sb3.append(false);
		assertEquals("false", sb3.toString());
		
		// Nos permite guardar objetos, aunque no como tal el objeto
		// si no la cadena que nos devuelva el método toString de los
		// objetos que le estemos insertando
		Persona persona = new Persona();
		persona.nombre = "Ramón";
		StringBuilder sb4 = new StringBuilder();
		sb4.append(persona);
		assertEquals("Ramón", sb4.toString());

	}
	
	@Test
	public void testMetodoCharAt() 
	{
		
		// El método charAt de está clase
		// te devuelve el caracter o el número que le corresponde en 
		// código UNICODE
		// ádemas utiliza indices para localizar para traer el caracter deseado
		StringBuilder sb1 = new StringBuilder("Vamos por esa certificación");
		assertEquals(97, sb1.charAt(1));
		assertEquals('a', sb1.charAt(1));
		
		// Si intentamos acceder a un indice negativo
		// nos enviara una excepción en runtime
		//			assertEquals("a", sb1.charAt(-1));
		
		//	Si el indice no se encuentra no se encuentra dentro del tamaño
		// que el objeto, nos enviara una excepcion en runtime
		//			assertEquals('1', sb1.charAt(200));
		
	}
	
	@Test
	public void testMetodoIndexOf() 
	{
		
		StringBuilder sb = new StringBuilder("3 am apunto ya de dormir :D");
		assertEquals(2, sb.indexOf("am"));
		
	}
}

class Persona {
	
	String nombre;

	@Override
	public String toString() {
		return nombre;
	}
}
