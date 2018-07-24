package com.cg.mypaymentapp.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;

public interface WalletService
{
	public Customer createAccount(Customer customer);
	
	public Customer showBalance (String mobileNo);
	
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
	
	public Customer depositAmount (String mobileNo,BigDecimal amount );
	
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
	
	public List<Transactions> showTransaction(String mobileNo);
	
	public List<Customer> getLowAccountDetails();
	
	public List<Customer> getAllCustomers();
	
}
