package com.RestApiAashokItBindings.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestApiAashokItBindings.Claas.Customer;

@RestController
public class CustomerController {
	
	@GetMapping(value="/controller",produces = {"application/json","application/xml"})
	public ResponseEntity<Customer> getControllerData() {
		
		//Produces attribute infers in which format method will be producing 
		//response
		//Above method will support for both xml and json format
		
		//ACCEPT header infers in which format client expects response from server
		//Accept header value should match with values present in produces
		//Produces is like menu of restaurant
		//If any other response is given by accept header http status code
		//406 NOT ACCEPTABLE
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("manish");
		customer.setCustomerPhoneNumber(88888499l);
		
		return new ResponseEntity<Customer> (customer,HttpStatus.OK);
		
		
		
	}

}
