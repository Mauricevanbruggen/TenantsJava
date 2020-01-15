package hostel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PaymentTest {
	
	private Payment p1 = new Payment("January", 100.0);
	
	@Test
	void testCreatePayment() {
		
		assertEquals(p1.getMonth(), "January");
		assertEquals(p1.getAmount(), 100.0);
		assertFalse(p1.equals(null));
	}
	
	@Test
	void testGetMounth() {
		assertEquals(p1.getMonth(), "January");
		assertNotEquals(p1.getMonth(), "February");
	}

	@Test
	void testGetAmount() {
		assertEquals(p1.getAmount(), 100);
		assertNotEquals(p1.getMonth(), 99.9);
	}

	@Test
	void testEqualsObject() {
		Payment p2 = new Payment("January", 100.0);
		Payment p3 = new Payment("february", 42);
		assertTrue(p1.equals(p1));
		assertTrue(p1.equals(p2));
		assertFalse(p1.equals(null));
		assertFalse(p1.equals(p3));
	}
	
	@Test
	void testToString() {
		assertEquals(p1.toString(),"January, 100.0");
	}
}
