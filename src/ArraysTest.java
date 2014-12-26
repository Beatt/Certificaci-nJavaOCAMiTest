import static org.junit.Assert.*;
import org.junit.Test;

public class ArraysTest {	
	
	@Test
	public void testMultidimensional() 
	{
		// Se inicializa un array de dos filas
		// el cual se debera inicializar el tamaño del las columnas
		String[] miArray[];
		miArray = new String[2][];
		
		// aquí inicializamos... si no lo hacemos
		// nos mandara un excepción en runtime...
		miArray[0] = new String[2];
		miArray[0][0] = "Fila 0 con 2 columnas";
		
		// La longitudad que tiene el objeto miArray
		assertEquals(2, miArray.length);
		
		// La longitud que tiene el indice 0 en el objeto miArray
		assertEquals(2, miArray[0].length);
		
		miArray[1] = new String[4];
		
		// La longitud que tiene el indice 1 en el objeto miArray
		assertEquals(4, miArray[1].length);
		
	}
	
	@Test
	public void testMDLI() 
	{
		// Forma 1
		int arrayM[][] = new int[][]{
				{1, 2, 3, 4},
				{5, 6},
				null
		};
		
		// Longitud de objeto arrayM
		assertEquals(3, arrayM.length);
		
		// Forma 2
		int arrayM2[][] = {				
				null,
				{2, 4, 5}				
		};
		
		// Longitud de objeto arrayM2
		assertEquals(2, arrayM2.length);
		
		int[] arrayM3[];
		
		// Error de compilación
//		arrayM3 = { 
//				{2, 4} 
//		};
		
		arrayM3 = new int[][]{
				null,
				null,
				{2, 4}
		};
		
		// Longitud del objeto arrayM3
		assertEquals(3, arrayM3.length);
		
	}
	
	@Test
	public void testMInicializandoPrimitiveType() 
	{
		
		// Datos primitivos permitidos para pasar establecer el
		// tamaño de un array...
		
			//		byte sizee = 5;
			//		int sizee = 5;
			//		short sizee = 5;
		char sizee = '5';
		
		
		// El tipo long no está permitido para colocar como tamaño
		// del arreglo
			//		long sizee = 5;
		
		boolean miArray[] = new boolean[sizee];
		
		assertEquals(53, miArray.length);
		
	}
	
}












