package org.springframework.roo.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.springframework.roo.northwind.domain.Customer;

/**
 * = CustomerRepositoryImpl
 *
 * Implementation of CustomerRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CustomerRepositoryCustom.class)
public class CustomerRepositoryImpl extends QueryDslRepositorySupportExt<Customer> implements CustomerRepositoryCustom{

    /**
     * Default constructor
     */
    CustomerRepositoryImpl() {
        super(Customer.class);
    }
}