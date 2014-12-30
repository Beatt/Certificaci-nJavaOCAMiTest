import static org.junit.Assert.*;

import org.junit.Test;


public class LiteralesCategoryNumeric {
	
	/*
	 * Para asignar un número en binario, octal, decimal
	 *  y hexadecimal se realiza de la siguiente manera
	 *  
	 *  
	 *  binario - Solo permite dos digitos, 0 y 1
	 * 		0b ó 0B
	 * 
	 * 	octal - Solo permite ocho digitos, 0 al 7
	 * 		0
	 * 
	 * 	decimal - Solo permite 10 digitos, 0 al 9
	 * 		no lleva ningun prefijo
	 * 
	 * 	hexadecimal - Solo permite 16 digitos, 0 al 9 y A a la F (Pueden ir en minusculas y mayusculas)
	 * 		0x ó oX
	 * 
	 * 
	 * Está permitido colocar la L ó l para el tipo long
	 * 	para cualquier valor literal, binario, octa, decimal, hexa
	 * 
	 * Está permitido para la categoria flotante, tipo de dato 
	 * 	float y decimal, sin embargo para colocar el prefijo de f, F, d ó D
	 * 	solo está permitido en las literales binario, octa, decimal, ya que 
	 * 	para el hexadecimal se evaluara como parte del número.
	 * 
	 */
	
	
	@Test
	public void binario() 
	{
		
		byte datoEnBinario1 = 0b01001;
		assertEquals(9, datoEnBinario1);
		
		short datoEnBinario2 = 0B00001;
		assertEquals(1, datoEnBinario2);
		
		int datoEnBinario3 = 0B00001;
		assertEquals(1, datoEnBinario3);
		
		long datoEnBinario4 = 0B00001l;
		//long datoEnBinario4 = 0B00001L;
		assertEquals(1, datoEnBinario4);
		
		float datoEnBinario5 = 0B00001;
		//float datoEnOctal5 = 02342F;
		assertEquals(1, datoEnBinario5, -.1);
		
		double datoEnBinario6 = 0b0011;
		//double datoEnOctal6 = 02342l;
		assertEquals(3, datoEnBinario6, -.1);
		
	}
	
	@Test
	public void octal() 
	{
		

		byte datoEnOctal1 = 017;
		assertEquals(15, datoEnOctal1);
		
		short datoEnOctal2 = 01723;
		assertEquals(979, datoEnOctal2);
		
		int datoEnOctal3 = 0172322;
		assertEquals(62674, datoEnOctal3);
		
		long datoEnOctal4 = 0172322L;
		//long datoEnOctal4 = 0172322l;
		assertEquals(62674, datoEnOctal4);
		
		float datoEnOctal5 = 02342f;
		//float datoEnOctal5 = 02342F;
		assertEquals(2342, datoEnOctal5, -.1);
		
		double datoEnOctal6 = 02342L;
		//double datoEnOctal6 = 02342l;
		assertEquals(1250, datoEnOctal6, -.1);
		
		
	}
	
	@Test
	public void decimal() {
		
		int datoEnDecimal = 1023123214;
		assertEquals(1023123214, datoEnDecimal);
		
	}
	
	@Test
	public void hexaDecimal() {
		
		byte datoHexa1 = 0x01;
		assertEquals(1, datoHexa1);
		
		short datoHexa2 = 0x01AAA;
		assertEquals(6826, datoHexa2);
		
		int datoHexa3 = 0X01AAAf;
		assertEquals(109231, datoHexa3);
		
		long datoHexa4 = 0X01AfBbl;
		//long datoHexa4 = 0x01AfBbL;
		assertEquals(110523, datoHexa4);
				
	}
	
	
}
