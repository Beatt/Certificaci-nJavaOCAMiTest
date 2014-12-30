import org.junit.Test;
import static org.junit.Assert.*;


public class UnderScore {
	
	@Test
	public void valid() {
		
		byte datoByte = 0b0_000_1;
		assertEquals(1, datoByte);
		
		short datoShort = 0_022_1;
		assertEquals(145, datoShort);
		
		// Si se coloca _L mandara un error de compilación
		long datoLong1 = 0b000_111_00_0L;
		assertEquals(56, datoLong1);
		
		// Toma a la d como parte del número
		long datoLong2 = 0XaaA_D_d;
		assertEquals(699101, datoLong2);
		
		int datoInt = 1_000_000;
		assertEquals(1_000_000, datoInt);				
		
		float datoFloat1 = 1_000_000f;
		assertEquals(1_000_000, datoFloat1, -.1);
		
		// Toma a la d como parte del número
		float datoFloat2 = 0Xaadf_F;
		assertEquals(699_903, datoFloat2, -.1);
		
		double datoDouble1 = 1_000;
		assertEquals(1_000, datoDouble1, -.1);
		
		// Toma a la d como parte del número
		double datoDouble2 = 0xbcDF;
		assertEquals(48_351D, datoDouble2, -.1);
				
	}

	/*
	public void invalid() {
		
		// Ni al principio ni al final
		int datoInt1 = _100_000;
		int datoInt2 = 100_000_;
		
		// despues de la 0b, oB, 0x, 0X
		float datoBinario1 = 0b_100_000;
		float datoBinario2 = 0B_100_000;		
		short datoOctal1 = 0x_32314;
		short datoOctal2 = 0X_32314;
		
		// antes de la l, L, f, F, d, D, para las literales
		// de tipo binario, octal y decimal, ya que para hexadecimal
		// está totalmente correcto.
		long datoLongBinario1 0b0_000_l;
		long datoLongBinario2 0b0_000_L;
		long datoLongDecimal1 100_000_l;
		long datoLongDecimal2 100_000_L;
		long datoLongOctal1 01_616_l;
		long datoLongOctal2 01_616_L;
		
		float datoFloat1 = 100._0;
		float datoFloat2 = 100_.0;
		
		// Lanza un excepción en ejecución
		int intParse = Integer.parseInt("111_222");
		
	}*/
}
