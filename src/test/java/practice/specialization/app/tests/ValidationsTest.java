package practice.specialization.app.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import practice.specialization.app.demos.basics.Validations;


public class ValidationsTest {
	
	private static Validations validate;
	
	@BeforeClass
	public static void initialize() {
		validate = new Validations();
		System.out.println("$$$$$$$$$Before$$$$$$$$$");
	}
	
	@AfterClass
	public static void clean() {
		validate = null;
		System.out.println("$$$$$$$$$After$$$$$$$$$");
	}
	
	@Test
	public void testIsEmail() {
//		Data - Email String & Expected Result
		Map<String, Boolean> emailDataMap = new HashMap<>();
		emailDataMap.put("sagar.mahajan@citiustech.com", true);
		emailDataMap.put("sagar.mahajancitiustech.com", false);
		emailDataMap.put("sagar.mahajan@citiustechcom", false);
		emailDataMap.put("sagar@mahajan@citiustech.com", false);
		
//		Assertions
		for (Map.Entry<String, Boolean> entry : emailDataMap.entrySet()) {
			String key = entry.getKey();
			Boolean val = entry.getValue();
			assertEquals(this.validate.isEmail(key), val);
		}
	}
	
	@Test
	public void testIsPhone() {
//		Data - Phone String & Expected Result
		Map<String, Boolean> phoneDataMap = new HashMap<>();
		phoneDataMap.put("1231231232", true);
		phoneDataMap.put("12312312311", false);
		phoneDataMap.put("123123123", false);
		phoneDataMap.put("123a123234", false);
		
//		Assertions
		for (Map.Entry<String, Boolean> entry : phoneDataMap.entrySet()) {
			String key = entry.getKey();
			Boolean val = entry.getValue();
			assertEquals(this.validate.isPhone(key), val);
		}
	}
	
	@Test
	public void testPasswordValid() {
//		Data - Password String & Expected Result
		Map<String, Boolean> passwordDataMap = new HashMap<>();
		passwordDataMap.put("sagar123", true);
		passwordDataMap.put("sagar@12", false);
		passwordDataMap.put("12345678", true);
		passwordDataMap.put("sagarmah", true);
		passwordDataMap.put("sagarma", false);
		
//		Assertions
		for (Map.Entry<String, Boolean> entry : passwordDataMap.entrySet()) {
			String key = entry.getKey();
			Boolean val = entry.getValue();
			assertEquals(this.validate.isPasswordValid(key), val);
		}
	}
}
