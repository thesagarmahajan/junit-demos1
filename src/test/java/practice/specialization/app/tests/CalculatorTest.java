package practice.specialization.app.tests;

import static org.hamcrest.CoreMatchers.anything;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import practice.specialization.app.demos.basics.Calculator;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void initialize() {
		this.calculator = new Calculator();
	}
	
	@After
	public void clean() {
		this.calculator = null;
	}
	
	@Test
	public void testAdd() {
		int addition = this.calculator.add(4, 2);
		assertEquals(addition, 6);
	}
	
	@Test
	public void testSubtract() {
		int subtraction = this.calculator.subtract(12, 3);
		assertEquals(subtraction, 9);
	}
	
	@Test
	public void testMultiply() {
		int multiplication = this.calculator.multiply(12, 12);
		assertEquals(multiplication, 144);
	}
	
	@Test
	public void testDivide() {
		int division = this.calculator.divide(100, 10);
		assertEquals(division, 10);
	}
}
