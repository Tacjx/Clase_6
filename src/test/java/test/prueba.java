package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class prueba {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Calculadora test=new Calculadora();
		double multiplicacion=test.multiplicar(80, 3);
		int expected=240;
		assertEquals(expected,multiplicacion);
		
	}

}
