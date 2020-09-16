package com.packageController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packageModel.Product;

@RestController
public class ProductServiceController {
   private static Map<String, Product> productRepo = new HashMap<>();
   static {
	      Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      productRepo.put(honey.getId(), honey);
	      
	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      productRepo.put(almond.getId(), almond);
	   }
   
   
   //---checking inside controller
   
   @RequestMapping(value= "/check")
   public String check() {
	   return "In the controller";
   }
   
   //----all products
   
   @RequestMapping(value ="/products")
   public ResponseEntity<Object> getProduct() {
	      return new ResponseEntity<Object>(productRepo.values(),HttpStatus.OK);
	   }
   
   //-----Delete-----
   @RequestMapping(value = "/productDelete/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
      productRepo.remove(id);
      return new ResponseEntity<Object>("Product is deleted successsfully", HttpStatus.OK);
   }
   
   
   //----Update----
   @RequestMapping(value = "/productUpdate/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
      productRepo.remove(id);
      product.setId(id);
      productRepo.put(id, product);
      return new ResponseEntity<Object>("Product is updated successsfully", HttpStatus.OK);
   }
   
   //----create------
   @RequestMapping(value = "/productCreate", method = RequestMethod.POST)
   public ResponseEntity<Object> createProduct(@RequestBody Product product) {
      productRepo.put(product.getId(), product);
      return new ResponseEntity<Object>("Product is created successfully", HttpStatus.CREATED);
   }
}
