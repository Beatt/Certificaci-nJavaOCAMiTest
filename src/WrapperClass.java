import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class WrapperClass {
	
	/*
	 * 
	 * Observaciones
	 * 
	 * 		O__o = Los wrappers Byte, Short, Integer, Float, Double heredan de la clase abstracta NUMBER
	 * 
	 * 		1- Respeta la jerarquia de los datos primitos
	 * 			no se le puede asignar un tipo de dato de mayor jerarquia
	 * 			a uno más pequeño, de igual manera que con los datos primitivos
	 * 			no, nos lo permite.
	 * 	
	 * 	Ejemplo
	 		
	 		long lng = 10;		
			Integer integer4 = new Integer(lng);
			assertEquals(10, integer4.intValue());
	 		
	 		float flat = 10.0f;
			Integer integer6 = new Integer(flat);
			assertEquals(97, integer6.intValue());
//			
//			2- Respeta la jerarquia de asignación de un char a un int o long, pero no viceversa.
//				Existe una excepción para los tipos Float y Double para estos si está permitido
//					pasar un valor de tipo double a un float y viceversa,
//					Ya que la clase automaticamente le realiza un cast
//			
//			3- Utilizando los métodos de conversión que proporciona la clase Number los datos devueltos
//				deberan ser del mismo tipo que se está devolviendo
				
				Ejemplo
				
					// No compila
					int a = integer5.doubleValue();
					
					// Compila
					double b = integer5.doubleValue();
					
//				Los métodos de conversión que proporciona son para los 6 tipos de datos primitivos 
//					pertenecientes a la categoria numeric
//					byte, short, int, long, float y double
//					
//			4- Las clases wrapper Boolean y Character solo nos proporcionar su método para devolver su 
//				propio tipo de dato, no proporciona la conversión para los tipos numeric.
//				
//			5- Los wrapper class Short y Byte no se les permite pasar un número numeric directamente
//				se tendrá que castear a su tipo correspondiente
				
				Ejemplo
					// No se permitee..
					Short shortt = new Short(10);
					Byte byt = new Byte(10);
					
					// Permite 
					Short shoorttt = 10;
					short sh = 10;
					shoorttt = new Short(sh);
					
				
	 * 
	 */
	
	@Test
	public void valid() {
		
		// Podemos asignar los valores de la misma forma que lo hacemos con un
		// objeto String 
		/**
		 *
		 * 
		 	Long lonng = 10;
		 	Long loonng = new Long(10);
		  
		 */
		
		
		Integer integer1 = new Integer(10);
		assertEquals(10, integer1.intValue());
		
		int entero = 10;
		Integer integer2 = new Integer(entero);
		assertEquals(10, integer2.intValue());
		
		byte bte = 10;
		Integer integer3 = new Integer(bte);
		assertEquals(10, integer3.intValue());

		char chr = 'a';
		Integer integer5 = new Integer(chr);
		assertEquals(97, integer5.intValue());
		
		//Byte bte2 = new Byte(entero);
		//Short shortt = new Short(entero);
		
		// Si la cadena no es diferente de null y 
		// es diferente de true enviara false
		// esto quiere decir que si le pasamos una cadena
		// como por ejemplo esto es una cadena, le va asignar false
		// a nuestro objeto
		Boolean bol = new Boolean("falsee");
		assertFalse(bol);
		
//		long loong = 10L;
//		Integer integer6 = new Integer(loong);
//		assertEquals(97, integer6.intValue());
		
	}
	
	@Test
	public void methodValue() {
		
		Float floaat = new Float(12);
		assertEquals(12, .2, floaat.floatValue());
		//System.out.println(floaat.floatValue());
		
		// La clase Float se le permite pasarle un parametro de tipo
		//	12.0D el cual es un tipo long.		

		Float floaat2 = new Float(12.0D);
		System.out.println(floaat2.floatValue());
		
		double douuble = 10.2;
		Float floaat3 = new Float(douuble);
		System.out.println(floaat3.floatValue());
		
	}
	
	/*
	 * Si el valor es igual devuelve cero, si no es así devuelve el valor mayor entre los
	 * 	dos objetos comparados.
	 * 
	 */
	
	@Test
	public void methodCompareTo() {
		
		Short shoort1 = 10;
		
		short shoort = 10;
		Short shoort2 = new Short(shoort);
		
		int compare = shoort1.compareTo(shoort2);
		assertEquals(0, compare);
		//Byte bte = new Byte(10);
//		Long lonng = new Long(10);
//		Character chr = new Character('a');
		
		//System.out.println(new Sub1());
		
		
	}
	
	@Test
	public void parse() {
		
		// Boleean
		assertFalse(Boolean.parseBoolean("false"));
		assertFalse(Boolean.parseBoolean("slada"));		
		assertTrue(Boolean.parseBoolean("TRUE"));
	
		// Numeric
		assertEquals(300, Short.parseShort("300"));
		
		// NumberFormatException
		//assertEquals(300, Short.parseShort("30a"));
		
		Short objShort = new Short((short) 1);
		assertEquals(1, objShort.shortValue());
		
		Byte objByte = new Byte((byte) 1);
		assertEquals(1, objByte.byteValue());
		
//		Float objFloat = Float.valueOf("222.2");
//		assertEquals(222.199, objFloat.floatValue(), -.1);
		
		Integer objInteger = Integer.valueOf("300");
		assertEquals(300, objInteger.intValue());				
		
		
	}
	
	
	@Test
	public void arrayListWrapper() {
		
		List<Integer> lstInteger = new ArrayList<>(5);
		lstInteger.add(2);
		lstInteger.add(3);
		assertEquals(2, lstInteger.size());
		
		Integer value = lstInteger.get(0);
		assertEquals(2, value.intValue());
		
		
		// Se le conoce como autoboxing
		// Cuando se imprime un wrapper, atuomaticamente llama intValue
		// o dependiendo el tipo de dato con el que se definio.
		System.out.println(value);
		System.out.println(lstInteger.get(0));		
		if(lstInteger.get(0) != 3);
		
		
	}
	
}

//
//
//class Super1 {
//    static int taxi = 1729;
//    static {System.out.println("Super");}
//}
//class Sub1 extends Super1 {
//    static { System.out.print("Sub "); }
//}

































