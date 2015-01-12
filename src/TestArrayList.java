import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
	
	/*
	 * La clase extiende de la clase AbstractArrayList(extiende de AbstractCollecion la cual implementa la
	 * 	interfaz Collection) e implementa la interfaz List
	 * 
	 * Permite elementos null
	 * Permite duplicados
	 */
	
	@Test
	public void initialize() {
		
		
		// Para inicializar un arrayList lo primero que debemos
		//	realizar es importar la clase del paquete java.util
		// 	y acontinuación instanciar el elemento.
		// El constructor por default, inicializa con capacidad de 10 elementos
		
		// Primera forma
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Uno");
		arrayList1.add("Dos");		
		
		assertEquals("Dos", arrayList1.get(1));
		
		// Segunda forma
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Tres");
		arrayList2.add("Cuatro");
		
		assertEquals("Tres", arrayList2.get(0));
		
		// Tercera forma
		arrayList1.addAll(2, arrayList2);
		
		assertEquals(4, arrayList1.toArray().length);
		
	
		
	}
	
	@Test
	public void methods() {
		
		ArrayList<String> arrayList = 
				new ArrayList<>();
		
		// Agrega al final del array
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.add("Cuatro");		
		// Agregar por indice
		arrayList.add(2, "Cinco");		
		
		
		
		
		// Tamaño
		assertEquals(4, arrayList.size());		
				
		
		
		
		// Modificar
		arrayList.set(0, "Doss");	
		assertEquals("Doss", arrayList.get(0));
				
				
		
		
		// Eliminar por indice
		arrayList.remove(0);		
		assertEquals(3, arrayList.size());		
		// Eliminar por objeto
		arrayList.remove("Tres");		
		assertEquals(2, arrayList.size());
		
		
		
		
		// Devuelve true con el primer elemento que sea igual
		assertTrue(arrayList.contains("Cinco"));
		// De no encontrarlo devuelve false
		assertFalse(arrayList.contains("Mil"));
		
		
		
		
		// Devuelve el indice de la primera concurrencia del elemento que le pasamos
		assertEquals(0, arrayList.indexOf("Cinco"));	
		// Si no existe devuelve -1
		assertEquals(-1, arrayList.indexOf("Kdsakdksaka"));
		
		
		
		
		// Devuelve el indice  de la última concurrencia del elemento que le pasamos
		// 	realiza lo contrario que indexOF, regresa -1 si no lo encuentra.
		assertEquals(1, arrayList.lastIndexOf("Cuatro"));
		
		
		
		
		// Trae un elemento por su indice, 
		assertEquals("Cinco", arrayList.get(0));		
		// Si no existe mandara una excepción en tiempo de ejecución
		// 	indexOutOfBoundsException
		// assertEquals("Cinco", arrayList.get(20));
					
	}
}
