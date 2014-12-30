import static org.junit.Assert.*;

import org.junit.Test;

public class VariableName {
	
	@Test
	public void valid() {
		
		int _variable1 = 10;
		int variable2_ = 20;
		int $variable3 = 30;
		int v4riabl34 = 40;
		int variable = 20;
		
		// Ya que no son palabras reserveda, nos permite
		int String = 20;
		int Integer = 20;
		
		// Combinación de palabras reservadas
		int intfloat = 20;
		
			
	}
	
	/*
	public void invalid() {
		
		// En cualquier posición los caracteres 
		//		|, %, {, }, [, ], ., ,, ;, ¬, ', " etc
		// mandaran un error de compilación
		
		// No se puede iniciar con un número
		// No están permitidas las palabras reservas
		
		int 4variable1 = 20;
		int |variable2 = 10;
		int %variable3 = 40;
		int int = 20;
		int .variable4 = 20;
		int variabl.e = 20;
		int ¬variable5 = 20;
		
		
	}*/
	
}
