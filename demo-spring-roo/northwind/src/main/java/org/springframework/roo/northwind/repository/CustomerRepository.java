package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Customer;

/**
 * = CustomerRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Customer.class)
public interface CustomerRepository extends DetachableJpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
