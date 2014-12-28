import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest 
{
	// Al utilizar los métodos de modificación
	// estos siempre nos van a devolver una nueva cadena
	// nunca se va modificar la cadena original
	// 		Los métodos de modificar son
	//		trim(), replace()
	
	@Test
	public void testInicializacion() 
	{
		// Puede recibir un byte, short, int, char o cadena
		// ademas también recibir arreglos de los tipos de datos primitivos
		// mencionados anteriormente
		
		// Se crea un objeto nuevo, no se encuentra en piscina
		String s1 = new String("Cadena");
		assertEquals("Cadena", s1);
		
		// Esto se encuentra en la piscina
		String s2 = "Cadena";
		assertEquals("Cadena", s2);
		
		// Su literal es null
		String s3 = null;
		assertNull(s3);
		
		char cadena[] = {'A', 'B', 'C'};
		String s4 = new String(cadena, 1, 2);		
		assertEquals("BC", s4);
				
		// INVESTIGAR ...
		byte[] cadenaByte = {6, 7};
		// Crea una cadena apartir del array que le pasamos
		// el cual se transforma a una cadena en UNICODE
		String s5 = new String(cadenaByte);		
		assertEquals("", s5);
				
		int cadenaInt[] = {2, 3, 4};
		String s6 = new String(cadenaInt, 0, 3);


		StringBuilder sb = new StringBuilder("Está bueno");
		String s7 = new String(sb);		
		assertEquals("Está bueno", s7);
		
	}
	
	@Test
	public void testIgualar() 
	{
		
		// Existen 2 objetos creados uno s1 y s2, s3 que referencian
		//	a delete, por lo tanto solo es un objeto.
		
		// 1 objeto
		String s1 = new String("Delete");
		
		// Estos dos objetos de tipo string se encuentra en la 
		// piscina, lo cual significa que tan solo existe un 
		// objeto creado
		// 2 objeto
		String s2 = "Delete";		
		assertFalse(s1 == s2);
		
		// 2 objeto
		String s3 = "Delete";
		assertTrue(s2 == s3);

	}

	@Test
	public void testMetodoCharAt() 
	{
		
		// Atraves del indice trae la letra que 
		// le corresponda		
		String s1 = new String();
		s1 = "Cualquiera :D";
		
		assertEquals('C', s1.charAt(0));
		
	}
	
	@Test
	public void testMetodoIndexOf() 
	{
		
		// Este método ademas de buscar una
		// una cadena(String) como lo es también el objeto
		// StringBuilder, permite buscar por int(char)
		// lo que el StringBuilder no puede...
		String s1 = "jess la chuky :P";
		assertEquals(2, s1.indexOf('s'));
		
		String s2 = "Annathema";
		assertEquals(8, s2.indexOf('a', 4));
		
	}
	
	@Test
	public void testMetodoSubString() 
	{
		// Permite traer una subcadena apartir de la posición 
		// del indice que le indiquemos o también el inicio y el fin de donde queremos
		// traer la subcadena... el fin no se incluye
		
		char[] arregloChar = {'M', 'E', 'A', 'T'};
		String s1 = new String(arregloChar);
		assertEquals("MEAT", s1.substring(0));
		
		
		// Devuelve una cadena String, aunque sea un unico chart
		// el cual devuelva, es una cadena no un char
		// 			char cadenaDevuelta = s1.substring(3);
		String cadenaDevuelta = s1.substring(2, 3);
		assertEquals("A", cadenaDevuelta);
		
	}
	
	@Test
	public void testMetodoTrim() 
	{
		
		// Elimina espacios en blanco, tabuladores, saltos de línea
		// No puede quitar los espacios en blanco entre caracteres		
		String s1 = new String(
				new StringBuilder(" Que te crees que no pueden pasar super meat boy :O  ")		
		);
		
		assertEquals("Que te crees que no pueden pasar super meat boy :O",
				s1.trim());
		
	}
	
	@Test
	public void testMetodoReplace() 
	{
		
		// Remplaza un caracter o una secuencia de caracteres,
		// pero no un String ::! por ejemplo en el objeto StringBuilder
		// Podemos remplazar solo un String no un char ni un array de char		
		String s1 = new String(
				new char[]{'A', 'B', 'C'}
		);
		
		String s1New = s1.replace('C', 'D');
		assertEquals("ABD", s1New);
		
	}
	
	@Test
	public void testMetodoLength() 
	{
		
		String s1 = new String("AB"); 
		assertEquals(2, s1.length());
		
	}
	
	@Test
	public void testMetodoStartWithAndEndWith() 
	{
		// Determina si la secuencia de la cadena pasada
		// es la primera que se encuentra
		// además podemos determinar desde que indice va 
		// comenzar a buscar, envia true en caso de ser y de lo contrario false		
		String s1 = new String("ABC");
		boolean s1D = s1.startsWith("AB");
		assertTrue(s1D);
		
		s1D = s1.startsWith("BC", 1);
		assertTrue(s1D);
		
		// Determina si la secuencia de la cadena pasada
		// se encuentra en el final de la cadena de ser así
		// envia true de lo contrario false
		// no podemos determinar desde que indice comenzar
		// este siempre comienza por el indice final de la cadena
		String s2 = "Cadenaaa";
		s1D = s2.endsWith("aa");
		assertTrue(s1D);
		
	}
	
	@Test
	public void testMethodChainig() 
	{
		char[] arrayChar = new char[]{'F', '2', 'D', 'G', ' '};
		String s1 = new String(arrayChar);
		
		assertEquals("f4dg", 
				s1.trim().
				replace('2', '4').
				toLowerCase());		
	}
	
}//Fin StringTest
