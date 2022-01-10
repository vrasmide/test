package com.jackrutorial;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class CustomerController {
 
 @Autowired
 private CustomerServiceImpl customerService;
 
 @GetMapping("/customer/")
 public List<Customer> getAllCustomer(){
  return customerService.getAllCustomer();
 }
 
 @GetMapping("/customer/{customerId}")
 public Customer getCustomerById(@PathVariable int customerId) {
  return customerService.getCustomerById(customerId);
 }
 
 @PostMapping("/customer/")
 public ResponseEntity<Void> addCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder builder){
  Customer customer = customerService.addCustomer(newCustomer);
  
  if(customer == null) {
   return ResponseEntity.noContent().build();
  }
  
  HttpHeaders headers = new HttpHeaders(null);
  headers.setLocation(builder.path("/customer/{id}").buildAndExpand(customer.getId()).toUri());
  return new ResponseEntity<Void>(HttpStatus.CREATED);
 }
 
 @PutMapping("/customer/")
 public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
  Customer c = customerService.getCustomerById(customer.getId());
  
  if(c == null) {
   return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
  }
  
  c.setName(customer.getName());
  c.setEmail(customer.getEmail());
  c.setDescription(customer.getDescription());
  
  customerService.updateCustomer(c);
  return new ResponseEntity<Customer>(c, HttpStatus.OK);
 }
 
 @DeleteMapping("/customer/{customerId}")
 public ResponseEntity<Customer> deleteCustomer(@PathVariable int customerId){
  Customer c = customerService.getCustomerById(customerId);
  
  if(c == null) {
   return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
  }
  
  customerService.deleteCustomer(customerId);
  return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
 }
}