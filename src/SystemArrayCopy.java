import static org.junit.Assert.*;

import org.junit.Test;


public class SystemArrayCopy {

	@Test
	public void testArrayCopy() {
		
		/*
		 * Tenemos 6 elementos
		 * 
		 * 0 , 1, [2], 3, 4, 5
		 * 
		 * Apartir del indice 2(parametro 2) se contara los elementos
		 * 	que se van a copiar al array actual(último parametro).
		 */
		int[] arrayActual = {
			1, 2, 3, 4, 5, 6	
		},
		
		/*
		 * Tenemos 4 elementos
		 * 
		 * 0, [1], 2, 3
		 * 
		 * Apartir del indice 1(parametro penultimo) se empezara a insertar
		 * 	los dos elementos (estos dos elementos los determinamos en el último parametro)
		 *  que establecimos en el arrayActual para que fueran
		 * 	copiados.
		 */
		arrayDestino = {
			10, 11, 12, 13				
		};
		
		System.arraycopy(arrayActual, 2, arrayDestino, 1, 2);
//		
//		for (int i : arrayDestino) {
//			System.out.println(i);
//		}
		
		assertEquals(6, arrayActual.length);
		
	}
	
	@Test
	public void testValid() {
		
		//	1- El array que vamos a copiar a otro, debera ser del mismo tipo de dato.
		//  2- Se comianza a copiar desde el indice que le indicamos al arrayActual(parametro 2).
		//	3- Se comienza a remplzar los elementos apartir del elemento que le indicamos al arrayDestino
		//		(parametro 4).
		
		int[] arrayActual = {
				1, 2, 3, 4, 5, 6	
			},
		
			arrayDestino = {
				10, 11, 12, 13				
			};
		
		//System.arraycopy(arrayActual, 3, arrayDestino, 2, 2);
		
		/*
		 * Si tratamos el mismo array, funciona básicamente igual,
		 * 	pero debemos tomar en cuenta que el arrayActual seguira siendo el mismo(parametro 3) en ningun
		 * 	momento los datos son perdidos por el proceso de copiar los elementos del parametro 1.
		 * 	El arrayActual con los nuevos valores se accede despues de la función.
		 * 	
		 * 	 
		 * 
		 	System.arraycopy(arrayActual, 3, arrayActual, 2, 2);
		 	
		 	// Aquí ya tenemos los nuevos datos
		 	for (int i : arrayActual) {
				System.out.println(i);
			}
				 
		 */
		
	}
	
	@Test
	public void invalid() {
		
		int[] arrayActual = {
				1, 2, 3, 4, 5, 6	
			},
		
			arrayDestino = {
				10, 11, 12, 13				
			};
		
		/*
		 * La longitud que vamos a copiar(parametro último) deberá
		 * 	estár en el rango del indice desde donde vamos a comenzar a copiar (parametro 2)
		 * 	
		 * 	Por ejemplo
		 * 	
		 *  Esto es permitido	  		
		 *  	System.arraycopy(arrayActual, 5, arrayDestino, 2, 1);
		 *  	
		 *  	Ya que la longitud (último parametro) le estamos diciendo que
		 *  		copie tan solo un elemento de arrayActual apartir de la posición
		 *  		del indice 5
		 *  		
		 *  		ArrayActual
		 *  			1, 2, 3, 4, 5, [6]
		 *  
		 *  	Pero si le decimos que realice lo siguiente
		   			System.arraycopy(arrayActual, 5, arrayDestino, 2, 2);
		 *  
		 *  	
		 *  	Nos mandara una excepción en tiempo de ejecución (ArrayIndexOutOfBounds)
		 *  	
		 *  
		 * 		
		 */
		
		
		/*
		 * No se permite indices negativos
		 * 
 			System.arraycopy(arrayActual, -5, arrayDestino, -2, -2);
 			System.arraycopy(arrayActual, -5, arrayDestino, 2, 2);
 			System.arraycopy(arrayActual, 5, arrayDestino, 2, -2);
 			System.arraycopy(arrayActual, 5, arrayDestino, -2, 2);
		 *  
		 */
		
		/*
		 * No se permiten tipos de datos diferentes
		 *	
		 *
		 	
			char[] arrayDestinoChar = {
				1, 2, 3, 4, 5, 6	
			};
	 		System.arraycopy(arrayActual, 5, arrayDestinoChar, 2, 2);
	 		
		 */
		
		
	}
	
}































