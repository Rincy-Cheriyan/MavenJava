package com.cg.model;

public class Account {
	
	private int accountId;
	private Customer customer;
	private int balance;
	public Account(int accountId, Customer customer, int balance) {
		super();
		this.accountId = accountId;
		this.customer = customer;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customer=" + customer + ", balance=" + balance + "]";
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
