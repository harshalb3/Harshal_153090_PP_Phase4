package com.cg.mypaymentapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.mypaymentapp.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String>{

	@Query("select cust from Customer cust where cust.wallet<1000")
	public List<Customer> getDetails();

	@Query("select wall from Customer wall")
	public List<Customer> getAll();
}
