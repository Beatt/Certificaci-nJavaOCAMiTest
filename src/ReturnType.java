import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnType {
	
	// Se permite regresar un tipo de dato primitivo
	// que sea menor que el tipo de retorno
	
	
	// el tipo caracter solo se podrá devolver si
	// el tipo de return es long, int o char
	
	// solo se permite integer con integer  
	//	decimales con decimales
	//  el tipo caracter es solo permitido para los integer
	
	// Los datos decimales float y double
	// solo se permitira regresar un float si el tipo de retorno
	// es float o double, ninguno otro, si se trata de realizar
	// enviara en error de compilación
	@Test
	public void returnType() 
	{
		assertEquals('a', metodoReturnType(10));
		assertEquals(1.34, metodoReturnType(10.2F), .10);
		
	}
	
	private long metodoReturnType(int dato) {
		
		char miDato = 'a';
		//float miDato = 1.34f;
		
		return miDato;
	}
	
	private double metodoReturnType(float dato) {
		
		float miDato = 1.34F;
		
		return miDato;
	}
	
	/* Esto mandara error ya que no se permite castear 
	 * de un elemento de prioridad mayor a menor.
	 * private float metodoReturnType(double dato) {
		
		double miDato = 1.34F;
		
		return miDato;
	}*/
	
}
