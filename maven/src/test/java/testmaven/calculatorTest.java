package testmaven;

import static org.junit.Assert.*;

import org.junit.After;	
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pkgcalculator.calculator;

public class calculatorTest {
	public static calculator objCalculator;
	public void setup() throws Exception {
		objCalculator=new calculator();
		
	}
	public void teardown() throws Exception{
		System.out.println("closing");
	}
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
