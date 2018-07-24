package com.cg.mypaymentapp.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Customer")
public class Customer 
{
	@Column(name="c_name")
	@NotEmpty
	@Pattern(regexp="^[A-Z]{1}\\w+$")
	private String name;
	
	@Id
	@Column(name="c_mobile_no")
	@NotEmpty
	@Pattern(regexp="^[7-9]{1}[0-9]{9}$")
	private String mobileNo;
	
	@Embedded
	private Wallet wallet;

	
	public Customer() 
	{
		
	}
	
	public Customer(String name, String mobileNo, Wallet wallet) {
		this.name=name;
		this.mobileNo=mobileNo;
		this.wallet=wallet;
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Customer name=" + name + ", mobileNo=" + mobileNo
				 + wallet;
	}
	
	
}
