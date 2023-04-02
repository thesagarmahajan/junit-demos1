package practice.specialization.app.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsDemo {

//	Test Cases
	
	@Test
	public void example1() {
		
//		Assertions
//		Checks equality
		assertEquals("Sagar", "Sagar");
		assertEquals("String1", "String2");
	}
	
	@Test
	public void example2() {
		String emailString = "sagar@gmail.com";
		assertNotNull(emailString);
		assertTrue(emailString.length()>5);
		assertTrue(emailString.indexOf("@") > 0);
		assertTrue(emailString.contains(".com"));
	}
}
