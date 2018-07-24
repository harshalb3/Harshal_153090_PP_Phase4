package com.cg.mypaymentapp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cust_Trans")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trans_id")
	private int transId;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="trans_history")
	private String trans;

	@Column(name="trans_date")
	private Date transDate;

	public Transactions() {
		super();
	}
	
	public Transactions(String mobileNo, String trans) {
		super();
		this.mobileNo = mobileNo;
		this.trans = trans;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

}
