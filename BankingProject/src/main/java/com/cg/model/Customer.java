package com.cg.model;

public class Customer {
	private int custID;
	private String custName;
	private Address address;
	public Customer(int custID, String custName, Address address) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", address=" + address + "]";
	}
	

}
