package com.cg.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;
//Test class
// 3 Model classes Customer,Address, Account
//interface BnkService
//implemented in a class BankServiceImpl
// user defined exception class
public class TestBank {
	
	public BankService bank;
	
	public TestBank()
	{
		bank=new BankServiceImpl();
	}
	
	@Test(expected=MinimumBalanceException.class)
	public void checkAccountCreation() throws MinimumBalanceException
	{
		Customer cusomer=new Customer();
		cusomer.setCustID(1001);
		cusomer.setCustName("Rahul");
		cusomer.setAddress(new Address("Pune","Maharashtra"));
		
		bank.createAccount(cusomer,500);
		
		
	}

}
