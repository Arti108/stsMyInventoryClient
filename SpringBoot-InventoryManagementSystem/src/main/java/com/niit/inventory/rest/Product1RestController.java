package com.niit.inventory.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.inventory.exception.ResourceNotFoundException;
import com.niit.inventory.model.Product;
import com.niit.inventory.model.Product1;
import com.niit.inventory.repository.UserPrRepository;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class Product1RestController {
	
	@Autowired
	private UserPrRepository urepo;

    @GetMapping("/products")  
	    public List<Product1> getAllProducts() {  
	         return  urepo.fetchProduct1Join();  
	    } 
    
    @GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long pId)
			throws ResourceNotFoundException {
		Product product = urepo.findById(pId)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pId));
		return ResponseEntity.ok().body(product);
	}
    
    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Long pId,
			@Valid @RequestBody Product p) throws ResourceNotFoundException {
     
	 Product product = urepo.findById(pId)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pId));
	 
	    		    
	    product.setBrand(p.getBrand());
	    product.setMadein(p.getMadein());
	    product.setName(p.getName());
	    product.setPrice(p.getPrice());
	    
	    final Product updatedProduct = urepo.save(product);
		return ResponseEntity.ok(updatedProduct);
    }
    
    @PostMapping("/products")  
    public Product saveProduct(@Valid @RequestBody Product product) {  
	 return urepo.save(product)  ;
       	          
    } 
    @DeleteMapping("/products/{id}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Long pId) 
    		throws ResourceNotFoundException{
	 Product product = urepo.findById(pId)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pId));
        urepo.delete(product);
        
        Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
 }
 
 
}