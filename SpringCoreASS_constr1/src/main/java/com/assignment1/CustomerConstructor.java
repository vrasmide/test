package com.assignment1;

public class CustomerConstructor {
	int customerId;
	long customerContact;
	
	String customerName,customerAddress;
	public CustomerConstructor(int customerId, long customerContact, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerContact = customerContact;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void display() {
		System.out.println("CustomerId:"+customerId+" customerName:"
			+customerName+" customerContact:"+customerContact+" customerAddress:"+customerAddress);
	}

}
