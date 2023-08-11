//package com.furlencoapp.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.furlencoapp.model.Customer;
//import com.furlencoapp.service.ICustomerService;
//
//@CrossOrigin(origins = "http://localhost:4200/") 
//@RestController
//@RequestMapping("/api/customer")
//public class CustomerController {
//
//    private final ICustomerService customerService;
//
//    @Autowired
//    public CustomerController(ICustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @PostMapping("/add")
//    public Customer addCustomer(@RequestBody Customer customer) {
//        return customerService.addCustomer(customer);
//    }
//
//    @PutMapping("/update")
//    public Customer updateCustomer(@RequestBody Customer customer) {
//        return customerService.updateCustomer(customer);
//    }
//
//    @DeleteMapping("/delete/{customerId}")
//    public void deleteCustomer(@PathVariable int customerId) {
//        customerService.deleteCustomer(customerId);
//    }
//
//    @GetMapping("/all")
//    public List<Customer> getAllCustomers() {
//        return customerService.getAllCustomers();
//    }
//
//    @GetMapping("/name/{customerName}")
//    public Customer findByCustomerName(@PathVariable String customerName) {
//        return customerService.findByCustomerName(customerName);
//    }
//}
