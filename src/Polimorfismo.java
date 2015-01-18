import static org.junit.Assert.*;

import org.junit.Test;

public class Polimorfismo {
	
	
	
	@Test
	public void testPolimorfismo() {
		
		assertEquals("Desarrollador Trabajando", new Desarrollador_1().trabajar());
		assertTrue(new Desarrollador_1().generarDinero(20));
		
	}
	
}


class Empleado_1 {
	
	public String trabajar() {return "Trabajando";}
	
	public boolean generarDinero(int dinero) {
		
		return true;
	}


	
}

class Desarrollador_1 extends Empleado_1 {
	
	// Sobrecarga de métodos
	public String trabajar(int String) { return 2 + super.trabajar();}
	
	
	// Sobreescritura
	public String trabajar() {
		return "Desarrollador " + super.trabajar();
	}
	
	public static void main(String[] args) {
		Empleado_1 empleado = new Desarrollador_1();
		empleado.trabajar();
		empleado.generarDinero(2);
		
	}
	
}

class Base{
	   void methodA(){
	      System.out.println("base - MethodA");
	   }
	}

	class Sub extends Base{
	   public void methodA(){
	      System.out.println("sub - MethodA");
	   }
	   public void methodB(){
	      System.out.println("sub - MethodB");
	   }
	   
	   void algo() {
	   
	   }
	   public static void main(String args[]){
	      Base b = new Sub(); //1
	      b.methodA(); //2
	      //b.methodB();
	      
	   }
	}

