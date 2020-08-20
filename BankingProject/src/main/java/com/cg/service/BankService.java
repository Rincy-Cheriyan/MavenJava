package com.cg.service;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Account;
import com.cg.model.Customer;

public interface BankService {

	public Account createAccount(Customer cusomer, int i) throws MinimumBalanceException;

}
