package com.cg.mypaymentapp.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.exception.InsufficientBalanceException;
import com.cg.mypaymentapp.exception.InvalidInputException;
import com.cg.mypaymentapp.repo.TransRepo;
import com.cg.mypaymentapp.repo.WalletRepo;

@Component(value="walletServices")
public class WalletServiceImpl implements WalletService 
{

	@Autowired(required=true)
	private WalletRepo repo;

	@Autowired
	private TransRepo trepo;

	@Override
	public Customer createAccount(Customer customer) {
		return repo.save(customer); 
	}

	@Override
	public Customer showBalance(String mobileNo){	
		return repo.findOne(mobileNo); 	
	}


	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount){
		if(sourceMobileNo==null||amount.compareTo(BigDecimal.ZERO)<=0||sourceMobileNo.trim().isEmpty()||targetMobileNo.trim().isEmpty()||targetMobileNo==null)
			throw new InvalidInputException("Inputs cannot be empty.");


		Customer cust=new Customer();

		Customer cust1=new Customer();

		Transactions tr=new Transactions();

		Transactions tr1=new Transactions();

		cust=repo.findOne(sourceMobileNo);

		BigDecimal bal1;

		bal1=cust.getWallet().getBalance();

		bal1=bal1.subtract(amount);

		cust.getWallet().setBalance(bal1);

		tr.setTrans(amount + " was transfered to "+targetMobileNo);

		tr.setMobileNo(sourceMobileNo);

		Date date =new Date();

		tr.setTransDate(date);

		trepo.save(tr);

		repo.save(cust);

		cust1=repo.findOne(targetMobileNo);

		BigDecimal bal2;

		bal2=cust1.getWallet().getBalance();

		bal2=bal2.add(amount);

		cust1.getWallet().setBalance(bal2);

		tr1.setTrans(amount + " was added from "+sourceMobileNo);

		tr1.setMobileNo(targetMobileNo);

		Date date1 =new Date();

		tr1.setTransDate(date1);

		trepo.save(tr1);

		repo.save(cust1);

		return cust;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount){

		Customer cust=new Customer();
		Transactions tr=new Transactions();

		cust = repo.findOne(mobileNo);

		BigDecimal bal1;

		bal1=cust.getWallet().getBalance();

		bal1=bal1.add(amount);

		cust.getWallet().setBalance(bal1);

		tr.setTrans(amount + " was deposited");

		tr.setMobileNo(mobileNo);

		Date date =new Date();

		tr.setTransDate(date);

		trepo.save(tr);

		repo.save(cust);

		return cust;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {

		Customer cust=new Customer();
		Transactions tr=new Transactions();

		cust = repo.findOne(mobileNo);

		BigDecimal bal1;

		bal1=cust.getWallet().getBalance();

		bal1=bal1.subtract(amount);

		cust.getWallet().setBalance(bal1);

		tr.setTrans(amount + " was withdrawn");

		tr.setMobileNo(mobileNo);

		Date date =new Date();

		tr.setTransDate(date);

		trepo.save(tr);

		repo.save(cust);

		return cust;
	}

	@Override
	public List<Transactions> showTransaction(String mobileNo) {
		List<Transactions> transaction = trepo.findByMobileNo(mobileNo);
		return transaction;
	}

	@Override
	public List<Customer> getLowAccountDetails() {
		return repo.getDetails();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.getAll();
	}


	public boolean isValid(Customer customer) throws InvalidInputException, InsufficientBalanceException
	{
		if(customer.getName() == null || customer.getName() == "")
		{
			throw new InvalidInputException("User Name cannot be null or empty.");

		}
		if(customer.getMobileNo() == null || customer.getMobileNo() == "")
			throw new InvalidInputException("User Mobile Number cannot be null or empty.");

		BigDecimal value = BigDecimal.ZERO;

		if(customer.getWallet().getBalance() == null ||customer.getWallet().getBalance().compareTo(value)==-1)
			throw new InvalidInputException("Wallet Balance cannot be Null.");

		if(!(customer.getName().matches("^([A-Z]{1}\\w+)$")))
		{
			throw new InvalidInputException("Invalid Name");
		} 
		if(!(customer.getMobileNo().length()==10))
			throw new InvalidInputException("Mobile Number is not 10 digit.");

		if(!(customer.getMobileNo().matches("^[7-9]{1}[0-9]{9}$")))
		{
			throw new InvalidInputException("Invalid Number");
		}

		return true;
	}



}
