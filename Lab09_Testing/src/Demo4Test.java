import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo4Test {
	
	Demo4 objDemo4Testing = new Demo4();

	@Test
	void testGetSum() {
		assertEquals(10,objDemo4Testing.getSum(5,5));
	}

	@Test
	void testGetSum2() {
		assertEquals( 10,objDemo4Testing.getSum(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
	
	@Test
	void testGetSum3() {
		assertEquals( 10,objDemo4Testing.getSum(Integer.MIN_VALUE, 10));
	}
}
