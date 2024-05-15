package com.Project.SpringAngular.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Project.SpringAngular.Dto.CustomerDTO;
import com.Project.SpringAngular.Dto.CustomerSaveDTO;
import com.Project.SpringAngular.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

@Autowired	
private CustomerService customerService;
@PostMapping(path = "/save")
public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
{
String id=customerService.addCustomer(customerSaveDTO);
return id;
}

}
