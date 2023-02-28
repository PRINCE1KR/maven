package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pkgcalculator.calculator;

public class testcalculator {
	public static calculator objCalculator;

	@Before
	public void setUp() throws Exception {
		objCalculator=new calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("closing");
	}

	@Test
		public void additionTest() {
			assertEquals(25, objCalculator.addition(12,13));
		}
		public void substractionTest() {
			assertEquals(-1,objCalculator.substraction(12, 13));
		}
		public void divisionTest() {
			assertEquals(0,objCalculator.division(12, 13));
		}
		public void multiplyTest() {
			assertEquals(156,objCalculator.multiplication(12, 13));
	}

}
