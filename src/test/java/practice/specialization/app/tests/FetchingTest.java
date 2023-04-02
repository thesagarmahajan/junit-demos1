package practice.specialization.app.tests;

import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import practice.specialization.app.demos.basics.Fetching;
import practice.specialization.app.demos.basics.Validations;

public class FetchingTest {
	
	private Fetching fetch;
	
	@Before
	public void initialize() {
		this.fetch = new Fetching();
	}
	
	@After
	public void clean() {
		this.fetch = null;
	}
	
	@Test(timeout = 5000)
	public void testHttpFetch() {
		assertNotEquals("Exception", this.fetch.HttpFetch()); 
	}
}
