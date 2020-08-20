package com.cg.service;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Account;
import com.cg.model.Customer;

public class BankServiceImpl implements BankService{

	public Account createAccount(Customer cusomer, int i) throws MinimumBalanceException {
		if(cusomer==null)
		{
			throw new IllegalArgumentException("Customer not available");
		}
		if(i<1000)
		{
			throw new MinimumBalanceException("Minimum Balance must be 1000");
		}
		Account acc=new Account();
		acc.setAccountId(101);
		acc.setBalance(i);
		acc.setCustomer(cusomer);
		return acc;
		
	}

}
