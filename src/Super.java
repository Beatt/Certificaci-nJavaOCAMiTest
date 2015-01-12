import static org.junit.Assert.*;

import org.junit.Test;

public class Super {
	
	
	@Test
	public void testSuper() {
		
		assertEquals("Gabo", new Desarrollador("Gabo").nombre);		
		
	}

}


class Empleado {
	
	String nombre;
	
	//public Empleado() {}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
}

class Desarrollador extends Empleado {
	
	
	// Si no declaramos ningun constructor en la clase padre
	// el compilador incluye el constructor por default y por ejemplo
	// en todos nuestros constructores de la clase desarrollador
	// implicitamente se agrega super();
	public Desarrollador(String nombre) {
		super(nombre);
		
		// Hace referencia a si mismo llamando a sus atributos derivados		
		//this.nombre = nombre;
		
		
		// No se puede llamar al constructor de la clase padre
		// sin argumentos a menos que no tenga ningun constructor
		// implementado, ya que el compilar incluye el constructor por default
		//super();		
		
	}
	
	public Desarrollador() {
		super("");
	}
	
}
