package test;

import static org.junit.Assert.assertEquals;

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
	@Test
	public void test2() {
		Calculadora test=new Calculadora();
		double suma=test.sumar(150, 180);
		double dividido=test.dividir(suma, 3);
		
		int expected=110;
		assertEquals(expected,dividido);
	}
	
	
	
	@Test
	public void test3() {
		Calculadora test=new Calculadora();
		double resta=test.restar(90,50);
		double multiplicado=test.multiplicar(resta, 15);
		
		int expected=605;
		assertEquals(expected,multiplicado);
	}
	
	
	@Test
	public void test4() {
		Calculadora test=new Calculadora();
		double suma=test.sumar(70, 40);
		double multiplicar=test.multiplicar(suma, 25);
		
		int expected=2700;
		assertEquals(expected,multiplicar);
	}
	

}
