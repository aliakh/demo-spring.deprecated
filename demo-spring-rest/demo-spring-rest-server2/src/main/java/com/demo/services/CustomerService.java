package com.demo.services;

import java.util.List;

import com.demo.persistence.model.Customer;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}
