import static org.junit.Assert.*;

import org.junit.Test;


public class ParametersType {

	@Test
	public void parametersType() 
	{
		
		// Buscara el método que tenga el parametro de tipo int o long
		assertEquals(1, metodoInteger(10));
		
		// Busca el método que tenga el parametro de tipo int o long
		char miChar = 10;
		assertEquals(4, metodoInteger(miChar));
		
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
