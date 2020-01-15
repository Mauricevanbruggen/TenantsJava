package hostel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PaymentListTest {
	
	private Payment p = new Payment("January", 100.0);
	private PaymentList pList = new PaymentList(4);

	@Test
	void testGetTotal() {
		Payment p = new Payment("January", 100.0);
		PaymentList pList = new PaymentList(2);
		assertEquals(pList.getTotal(), 0);
		
		pList.addPayment(p);
		assertEquals(pList.getTotal(), 1);
	}

	@Test
	void testIsFull() {
		Payment p = new Payment("January", 100.0);
		PaymentList pList = new PaymentList(1);
		assertFalse(pList.isFull());
		
		pList.addPayment(p);
		assertTrue(pList.isFull());
		
	}

	@Test
	void testGetPayment() {
		Payment p = new Payment("January", 100.0);
		PaymentList pList = new PaymentList(1);
		pList.addPayment(p);
		assertEquals(pList.getPayment(-1), null);
		assertEquals(pList.getPayment(2), null);
		assertEquals(pList.getPayment(1), p);		
	}

	@Test
	void testCalculateTotalPaid() {
		Payment p = new Payment("January", 100.0);
		Payment p2 = new Payment("February", 120.0);
		Payment p3 = new Payment("March", 140.0);
		PaymentList pList = new PaymentList(3);
		pList.addPayment(p);
		pList.addPayment(p2);
		pList.addPayment(p3);
		
		assertEquals(pList.calculateTotalPaid(), 360.0);
		assertNotEquals(pList.calculateTotalPaid(), 0);
	}

	@Test
	void testEqualsObject() {
		Payment p = new Payment("January", 100.0);
		Payment p2 = new Payment("February", 120.0);
		Payment p3 = new Payment("March", 140.0);
		PaymentList pList = new PaymentList(3);
		PaymentList pList2 = new PaymentList(3);
		
		assertTrue(pList.equals(pList2));
		
		pList.addPayment(p);
		pList.addPayment(p2);
		pList2.addPayment(p);
		pList2.addPayment(p2);
		
		assertTrue(pList.equals(pList2));
		
		pList2.addPayment(p3);
		
		assertFalse(pList.equals(pList2));
	}

	@Test
	void testToString() {
		Payment p = new Payment("January", 100.0);
		Payment p2 = new Payment("February", 150.0);
		PaymentList pList = new PaymentList(1);
		pList.addPayment(p);
		pList.addPayment(p2);
		
		assertEquals(pList.toString(), "January, 100.0 February, 150.0");
	}
}
