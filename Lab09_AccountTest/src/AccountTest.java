import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	Account acc = new Account(1000, "Earl", 2920292);


	@Test
	void testWithdrawDouble() {
		fail("Not yet implemented");

	}

	@Test
	void testWithdrawDoubleDouble() {
		fail("Not yet implemented");
	}
	
	@Test
	void testDeposit() {
		fail("Not yet implemented");

	}


	@Test
	void testGetBalance() {
		assertEquals(1000,acc.getBalance());
	}
	
	@Test
	void testGetBalance2() {
		acc.deposit(10);
		assertEquals(1010,acc.getBalance());
	}


	@Test
	void testGetAcctNumber() {
		assertEquals(2920292, acc.getAcctNumber());
	}

}
