package practice.specialization.app.standalonetests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionOrderTest {
	
	@Test
	public void test1() {
		assertEquals(0, 0);
	}
	
	@Test
	public void test2() {
		assertEquals(0, 0);
	}
	
	@Test
	public void test3() {
		assertEquals(0, 0);
	}
	
	@Test
	public void test4() {
		assertEquals(0, 0);
	}
}
