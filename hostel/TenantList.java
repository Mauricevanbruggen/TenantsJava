package hostel;

import java.util.ArrayList;

public class TenantList {
	
	protected ArrayList<Tenant> tenantList; 
	public final int MAX;
	
	/**
	 * Constructor
	 * @param max
	 */
	public TenantList(int max) {
		tenantList = new ArrayList<>();
		MAX = max;
	}
	
	/**
	 * check if the tenant list is full
	 * @return true iff list is full
	 */
	public boolean isFull() {
		return this.tenantList.size() == MAX;
	}
	
	/**
	 * check if tenant list is empty
	 * @return return true iff list is empty
	 */
	public boolean isEmpty() {
		return this.tenantList.isEmpty();
	}
	
	/**
	 * add a Tenant
	 * @param tenant
	 * @return true when Tenant is added 
	 * to the tenantList
	 */
	public boolean addTenant(Tenant tenant) {
		if (!(isFull())) {
			tenantList.add(tenant);
			return true;
		}
		return false;
	}
	
	/**
	 * search the list for a Tenant
	 * @param room
	 * @return Tenant
	 */
	public Tenant search(int room) {
		for (Tenant t : tenantList) {
			if (t.getRoom() == room) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * remove tenant iff it's in the list
	 * @param room
	 * @return true iff tenant was in the list 
	 * and is removed
	 */
	public boolean removeTenant(int room) {
		Tenant t = search(room);
		
		if (t != null) {
			tenantList.remove(t);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof TenantList) {
			TenantList that = (TenantList) other;
			return this.tenantList.containsAll(that.tenantList) &&
					that.tenantList.containsAll(this.tenantList);
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for (Tenant t : tenantList) {
			s += t.toString();
		}
		return s;
	}
	

}
