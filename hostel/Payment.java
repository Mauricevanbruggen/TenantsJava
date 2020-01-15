package hostel;

public class Payment {

	private String month;
	private double amount; 
	
	/**
	 * Constructor
	 * @param month
	 * @param amount
	 */
	public Payment(String month, double amount) {
		super();
		this.month = month;
		this.amount = amount;
	}

	/**
	 * returns the month
	 * @return
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * returns the amount paid
	 * @return amount
	 */
	public double getAmount() {
		
		return amount;
	}
	
	/**
	 * returns true iff Payment this
	 * equals Payment that
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof Payment) {
			Payment that = (Payment) other;
			return this.amount == that.amount &&
					this.month.equals(that.month);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getMonth() + ", " + this.amount;
	}
}
