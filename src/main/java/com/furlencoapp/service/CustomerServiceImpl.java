package com.furlencoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furlencoapp.exception.CustomerNotFoundException;
import com.furlencoapp.model.Customer;
import com.furlencoapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.insert(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getCustomerId())
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + customer.getCustomerId()));

        // Update existing customer properties here

        return customerRepository.save(existingCustomer);
    }

    @Override
    public void deleteCustomer(int customerId) {
        Customer existingCustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + customerId));
        customerRepository.delete(existingCustomer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + customerId));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByCustomerName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }
}
