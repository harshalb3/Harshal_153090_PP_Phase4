package com.cg.mypaymentapp.controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.service.WalletService;




@Controller 
public class CustomerActionController {

	@Autowired
	WalletService walletService;

	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid @ModelAttribute("customer")Customer customer, BindingResult result){
		try {

			if(result.hasErrors()) return new ModelAndView("registerCustomer");

			customer=walletService.createAccount(customer);
		}catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("errorPage");
		}
		return new ModelAndView("registerSuccess","customer",customer);
	}


	@RequestMapping(value="/getCustomer")
	public ModelAndView getCustomer(@ModelAttribute("customer")Customer customer){

		customer=walletService.showBalance(customer.getMobileNo());

		return new ModelAndView("loginSuccess","customer",customer);
	}

	@RequestMapping(value="/customerDeposit")
	public ModelAndView customerDeposit(@RequestParam("mobileNo")String mobileNo,@RequestParam("amount")BigDecimal amount){

		Customer customer=walletService.depositAmount(mobileNo, amount);

		return new ModelAndView("depositSuccess","customer",customer);
	}

	@RequestMapping(value="/customerWithdraw")
	public ModelAndView customerWithdraw(@RequestParam("mobileNo")String mobileNo,@RequestParam("amount")BigDecimal amount){

		Customer customer=walletService.withdrawAmount(mobileNo, amount);

		return new ModelAndView("withdrawSuccess","customer",customer);
	}

	@RequestMapping(value="/customerTransfer")
	public ModelAndView customerTransfer(@RequestParam("sourceMobileNo")String sourceMobileNo,@RequestParam("targetMobileNo")String targetMobileNo,@RequestParam("amount")BigDecimal amount){

		Customer customer=walletService.fundTransfer(sourceMobileNo, targetMobileNo, amount);

		return new ModelAndView("transferSuccess","customer",customer);
	}


	@RequestMapping(value="/customerHistory")
	public ModelAndView customerHistory(@RequestParam("mobileNo")String mobileNo){

		List<Transactions> history;

		history=walletService.showTransaction(mobileNo);

		return new ModelAndView("showSuccess","transaction",history);
	}

	@RequestMapping(value="/showLowAccounts")
	public ModelAndView showLowAccounts(@ModelAttribute("customer")Customer customer){

		List<Customer> lowacc=walletService.getLowAccountDetails();

		return new ModelAndView("lowAccountsSuccess","customer",lowacc);
	}

	@RequestMapping(value="/getAllAccounts")
	public ModelAndView gteAllAccounts(){

		List<Customer> allacc=walletService.getAllCustomers();

		return new ModelAndView("getAllSuccess","customer",allacc);
	}

}

