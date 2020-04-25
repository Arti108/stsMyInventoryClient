package com.niit.inventory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.inventory.model.Order1CustomerProduct;
import com.niit.inventory.repository.UserRepository;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class OrderRestController {
	
	@Autowired
	private UserRepository urepo;

    @GetMapping("/order1")  
	    public List<Order1CustomerProduct> listAllOrder() {  
	         return  urepo.fetchOrder1InnerJoin();  
	    }  
}