package hostel;

public class Tenant {
	
	private String name;
	private int room;
	private PaymentList paymentList;
	public static final int MAX = 12;
	
	/**
	 * constructor
	 * @param name
	 * @param room
	 */
	public Tenant(String name, int room) {
		super();
		this.name = name;
		this.room = room;
		paymentList = new PaymentList(MAX);
	}
	
	/**
	 * record a payment for a Tenant
	 * @param payment
	 */
	public void makePayment(Payment payment) {
		paymentList.addPayment(payment);
	}

	/**
	 * get the Tenants name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * get the room
	 * @return
	 */
	public int getRoom() {
		return room;
	}
	
	public PaymentList getPaymentList() {
		return paymentList;
	}
	/**
	 * equals method
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof Tenant) {
			Tenant that = (Tenant) other;
			return this.name.equals(that.name) &&
					this.room == that.room;		
		}
		return false;
	}
	
	/**
	 * to string method
	 */
	@Override
	public String toString() {
		return name + ", " + room + paymentList;
	}
}
