package com.Project.SpringAngular.services;

import com.Project.SpringAngular.Dto.CustomerDTO;
import com.Project.SpringAngular.Dto.CustomerSaveDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

}
