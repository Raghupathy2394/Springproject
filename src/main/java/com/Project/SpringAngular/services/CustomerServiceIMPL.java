package com.Project.SpringAngular.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.Project.SpringAngular.Dto.CustomerSaveDTO;
import com.Project.SpringAngular.entity.Customer;
import com.Project.SpringAngular.repository.CustomerRepo;

public class CustomerServiceIMPL implements  CustomerService{
@Autowired
private CustomerRepo customerRepo;
	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		Customer customer=new Customer(
				 CustomerSaveDTO.getCustomername(),
				CustomerSaveDTO.getCustomeraddress(),
				CustomerSaveDTO.getMobile()
				);
	customerRepo.save(customer);
	return customer.getCustomername();
	}}
