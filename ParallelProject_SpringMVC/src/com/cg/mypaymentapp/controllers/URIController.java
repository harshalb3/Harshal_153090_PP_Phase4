package com.cg.mypaymentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;

@Controller
public class URIController {
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "index";
	}

	@RequestMapping(value="/register")
	public String getRegistrationPage(){
		return "registerCustomer";
	}
	
	@ModelAttribute("customer")
	public Customer getCustomer(){
		return new Customer();
	}
	
	@ModelAttribute("transaction")
	public Transactions getTransaction(){
		return new Transactions();
	}
	
	@RequestMapping(value="/login")
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="/deposit")
	public String getDepositPage() {
		return "deposit";
	}
	
	@RequestMapping(value="/withdraw")
	public String getWithdrawPage() {
		return "withdraw";
	}
	
	@RequestMapping(value="/transfer")
	public String getTrasnferPage() {
		return "fundTransfer";
	}
	
	@RequestMapping(value="/show")
	public String getShowPage() {
		return "show";
	}
	
	@RequestMapping(value="/lowaccounts")
	public String getLowAccountsPage() {
		return "lowaccounts";
	}
	
	@RequestMapping(value="/getall")
	public String getAllPage() {
		return "getall";
	}
}
