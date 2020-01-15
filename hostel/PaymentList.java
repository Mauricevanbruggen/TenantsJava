package hostel;

import java.util.ArrayList;

public class PaymentList {
	
	protected ArrayList<Payment> payList;
	public final int MAX;
	
	/**
	 * constructor
	 * @param max
	 */
	public PaymentList(int max) {
		payList = new ArrayList<>();
		MAX = max;
	}
	
	/**
	 * returns the size of the payList
	 * @return
	 */
	public int getTotal() {
		return payList.size();
	}
	
	/**
	 * check if the list is full
	 * @return
	 */
	public boolean isFull() {
		return payList.size() == MAX;
	}

	/**
	 * adds a payment to the list
	 * @param payment
	 * @return Return true iff list is not full
	 */
	public boolean addPayment(Payment payment) {
		if (!(isFull())) {
			this.payList.add(payment);
			return true;
		}
		return false;
	}
	
	/**
	 * get a Payment from the list
	 * @param position
	 * @return
	 */
	public Payment getPayment(int position) {
		if (position < 1 || position > getTotal()) {
			return null;
		} else {
			return payList.get(position -1);
		}
	}
	
	/**
	 * get the total payments from the list
	 * @return
	 */
	public double calculateTotalPaid() {
		double totalPaid = 0; 
		
		for (Payment p : payList) {
			totalPaid += p.getAmount();
		}
		return totalPaid;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof PaymentList) {
			PaymentList that = (PaymentList) other;
			return this.payList.containsAll(that.payList) &&
			that.payList.containsAll(this.payList);
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for (Payment p : payList) {
			s += p.toString();
		}
		return s;
	}
}
