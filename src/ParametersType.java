import static org.junit.Assert.*;

import org.junit.Test;


public class ParametersType {

	@Test
	public void parametersType() 
	{
		
		// Buscara el método que tenga el parametro de tipo int o long
		assertEquals(3, metodoInteger(10));
		
		// Busca el método que tenga el parametro de tipo int o long
		char miChar = 10;
		assertEquals(3, metodoInteger(miChar));
		
	}
	
	@Test
	public void parameterTypeChar() 
	{
		
		assertEquals('a', metodoReturnChar());
		
		// No acepta un número entero en un parametro de tipo char
		// solo al contrario de un char a un topo int
		//assertTrue(metodoParameterChar(10));
		
	} 

//	private boolean metodoParameterChar(char i) {
//		return true;
//	}

	// Ya que el tipo char pertenece al grupo de character 
	// no se permite que convertir de un tipo de dato
	// de otro grupo , solo se permite del mismo grupo
	// y el grupo solo existen un tipo char
//	private char metodoReturnChar() 
//	{
//		int bite = 10;
//		return bite;
//	}
	private char metodoReturnChar() {
		return 'a';
	}
	

	private byte metodoInteger(byte i) {
		return 1;
	}
	
	private short metodoInteger(short i) {
		return 2;
	}
	
	private int metodoInteger(int i) {
		return 3;
	}
	
	private long metodoInteger(long i) {
		return 4;
	}	
}
