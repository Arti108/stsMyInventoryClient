package com.niit.inventory.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.inventory.exception.ResourceNotFoundException;
import com.niit.inventory.model.Customer;
import com.niit.inventory.model.Customer1;
import com.niit.inventory.repository.UserCsRepository;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class CustomerRestController {
	@Autowired
	private UserCsRepository crepo;

    @GetMapping("/customers")  
	    public List<Customer1> listAllCustomer() {  
	         return  crepo.fetchCustomer1Join();  
	    } 
    
    @DeleteMapping("/customers/{cust_id}")
    public Map<String, Boolean> deleteCustomers(@PathVariable(value = "cust_id") Integer cId) 
    		throws ResourceNotFoundException{
	 Customer customer = crepo.findById(cId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + cId));
        crepo.delete(customer);
        
        Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
 }
}
