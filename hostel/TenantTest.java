package hostel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenantTest {
	
	private Payment p1 = new Payment("January", 100.0);
	private Payment p2 = new Payment("February", 110.0);
	private Payment p3 = new Payment("march", 120.0);
	private Payment p4 = new Payment("January", 130.0);
	
	private String name1 = "Henk";
	private String name2 = "Kees";
	
	private int room1 = 1;
	private int room2 = 2;
	
	
	

	@Test
	void test() {
		PaymentList pList = new PaymentList(4);
		pList.addPayment(p1);
		pList.addPayment(p2);
		pList.addPayment(p3);
		pList.addPayment(p4);
		
		Tenant t = new Tenant(name1, room1);
		System.out.println(t.toString());
	}

}
