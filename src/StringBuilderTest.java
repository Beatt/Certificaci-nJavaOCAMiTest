import static org.junit.Assert.*;

import org.junit.Test;

public class StringBuilderTest 
{
	
	// Cuando trabajamos con indices 
	// no se permite especificar indices negativos
	// si esto sucede enviara un error de compilación
	
	// Métodos query nos devuelven un caracter o cadena
	//		charAt
	//		indexOf
	//		subString
	
	// Métodos modify , modifican la cadena del objeto
	//		append
	//		reverse
	//		replace
	//		insert 
	//		delete
	//		deleteCharAt
	
	// Métodos otros
	//		length
	//		trimToSize
	
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
		
		// Trae el index del la primera concurrencia del la cadena
		//	Podemos determinar desde que indice empieze a buscar
		//	Si no se encuentra la cadena mandara un -1
		StringBuilder sb = new StringBuilder("3 am apunto ya de dormir :D");
		assertEquals(2, sb.indexOf("a"));
		
		
		// Inicializamos la posición del indice donde queremos que empieze
		// a buscar...
		assertEquals(-1, sb.indexOf("am", 6));
		
	}
	
	@Test
	public void testMetodoSubString() 
	{
		
		// Trae una subcadena, podemos especificarle el inicio y el final
		// de la subcadena..
		// pero no modifica el objeto...
		
		StringBuilder sb = 
				new StringBuilder("Mirando a mis primos jugar Super meat boy");
		
		assertEquals("primos", sb.substring(14, 20));
		assertEquals(" jugar Super meat boy", sb.substring(20));
		
	}

	@Test
	public void testMetodoReverse() 
	{
		// Trae una referencia de este objeto
		// con la cadena alreves
		StringBuilder sb = new StringBuilder();
		sb.append("vi");

		assertEquals("iv", sb.reverse().toString());
	}
	
	@Test
	public void testMetodoInsert()
	{
		// Inserta un caracter o un arreglo de caracteres
		// debemos colocar el indice donde se va insertar 
		// tal indice que contenga el caracter 
		//	terminara al final de la cadena
		StringBuilder sb = new StringBuilder("palabra");
		sb.insert(0, "Insertando ");		
		assertEquals("Insertando palabra", sb.toString());
		
		StringBuilder sb2 = new StringBuilder("array");
		sb2.insert(5, new char[]{' ', 'd', 'e'});
		assertEquals("array de", sb2.toString());


		StringBuilder sb3 = new StringBuilder("array");
		// Determinamos desde que indice va comenzar y con el ulitmo parametro
		// le decimos que apartir de ese indice cuente n caracteres y los inserte
		sb3.insert(5, new char[]{' ', 'd', 'e', 'c', 'h', 'a', 'r', 's'}, 1, 5);
		assertEquals("arraydecha", sb3.toString());
		
	}
	
	@Test
	public void testMetodoReplace() 
	{
		
		// Regresa este objeto con la cadena remplazada
		// recibe 3 parametros
		// 1 - inicio desde donde se va sustituir
		// 2 - fin desde donde se va sustituir (no se incluye)
		// 3 - La cadena que va sustituir por el inicio y fin
		StringBuilder sb = new StringBuilder("Como molesta mi perro con su baba @_@");
		
		assertEquals("Como no molesta mi perro con su baba @_@",
				sb.replace(4, 4, " no").toString());
		
		StringBuilder sb0 = new StringBuilder("Algo");
		assertEquals("ALgo", sb0.replace(0, 2, "AL").toString());
		
		// Si se coloca el inicio y fin igual se va colocar antes del inicio la cadena
		// no sustitutye ningun caracter.
		StringBuilder sb1 = new StringBuilder("Replace");
		assertEquals("replaceReplace", sb1.replace(0, 0, "replace").toString());
	
	}
	
	public void testMetodoTrim() 
	{
		
		// Elimina la capacidad de default que 
		// se le asigna a una cadena apartir de su longitud
		// que tiene
		StringBuilder sb = new StringBuilder("Ratón");
		assertEquals(5, sb.length());
		assertEquals(21, sb.capacity());
		
		sb.trimToSize();
		
		assertEquals(5, sb.length());
		assertEquals(5, sb.capacity());
		
		
	}
	
	@Test
	public void testMetodoDeleteAndDeleteCharAT() 
	{
		// Permite borrar una cadena apartir de los indices
		// de inicio y final
		// el indice final no se incluye...
		
		// Capacidad de 40
		StringBuilder sb1 = new StringBuilder(40);
		sb1.append("Estos chamacos son un desmadre");
		sb1.delete(0, 15);		
		assertEquals("son un desmadre", sb1.toString());
		
		// Solo contiene un método el cual recibe el indice
		// del caracter que deseemos eliminar
		StringBuilder sb2 = new StringBuilder("Vamos a la mitad para la certificación");
		sb2.deleteCharAt(5);
		assertEquals("Vamosa la mitad para la certificación", sb2.toString());
	}
	
	@Test
	public void testMetodoTrimToSize() 
	{
		
		// Elimina el número de default que se le agrega
		//	a la cadena que le asignemos...		
		StringBuilder sb = new StringBuilder("Cuatro");
		
		assertEquals(6, sb.length());
		assertEquals(22, sb.capacity());
		
		sb.trimToSize();
		
		assertEquals(6, sb.length());
		assertEquals(6, sb.capacity());
		
	}
	
	@Test
	public void testCombinacionMetodos() 
	{
		// Los métodos que nos devuelvan el objeto
		// podemos utilizar otros métodos para combinar
		//		Métodos combinar
		//			replace, subString
		
		StringBuilder sb = new StringBuilder("Combinando");
		
		assertEquals('O', sb.replace(0, 1, "CO").charAt(1));
		
		// COombinando
		//		mbinando
		assertEquals(-1, sb.substring(3).indexOf("C"));
		
		// COombinando
		//	mbina
		assertEquals(4, sb.substring(3, 8).indexOf("a"));
		
		assertEquals('o', sb.replace(0, 1, "co").charAt(1));
		
		//assertEquals("odnanibmOC", sb.replace(0, 1, "CO").reverse().toString());
		
	}
}

class Persona {
	
	String nombre;

	@Override
	public String toString() {
		return nombre;
	}
}
