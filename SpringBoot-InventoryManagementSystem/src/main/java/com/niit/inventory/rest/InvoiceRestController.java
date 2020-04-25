/*package com.niit.inventory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.inventory.model.InvoiceOrder1;
import com.niit.inventory.repository.UserInRepository;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class InvoiceRestController {
	
	@Autowired
	private UserInRepository urepo;

    @GetMapping("/invoice")  
	    public List<InvoiceOrder1> getAllInvoice() {  
	         return  urepo.fetchInvoiceInnerJoin();  
	    }  
}
*/