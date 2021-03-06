package com.projectX.CustomerService;


import org.springframework.stereotype.Service;

import com.projectX.Customer.CustomerDetails;
import com.projectX.Customer.Request.CustomerDetailsRequest;
import com.projectX.Customer.Response.CustomerDetailsResponse;

@Service
public interface CustomerService {

	CustomerDetailsResponse getAllCustomer();

	CustomerDetailsResponse getCustomer(String id);

	void addCustomer(CustomerDetailsRequest customer);

	void updateCustomer(String id, CustomerDetailsRequest customer);

	void deleteCustomer(CustomerDetailsRequest customer);

	CustomerDetailsResponse loginCustomer(CustomerDetailsRequest customer);
	
	CustomerDetails findByUsername(String customername);
	
	CustomerDetails getCustomerDetails(String username, String password);
	
	
}
