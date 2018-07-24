package com.cg.mypaymentapp.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Wallet 
{	
	@Column(name="c_balance")
	private BigDecimal balance;

	public Wallet() {
		super();
	}	
	
	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
		public String toString() {
		return ", balance="+balance;
	}
	
}
