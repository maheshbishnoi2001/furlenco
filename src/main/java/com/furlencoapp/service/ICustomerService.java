package com.furlencoapp.service;

import java.util.List;

import com.furlencoapp.exception.CustomerNotFoundException;
import com.furlencoapp.model.Customer;

public interface ICustomerService {
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(int customerId) throws CustomerNotFoundException;
    Customer getCustomerById(int customerId) throws CustomerNotFoundException;
    List<Customer> getAllCustomers();
    Customer findByCustomerName(String customerName);
}
