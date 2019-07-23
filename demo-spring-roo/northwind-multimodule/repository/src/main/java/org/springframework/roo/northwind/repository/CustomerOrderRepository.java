package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.CustomerOrder;

/**
 * = CustomerOrderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = CustomerOrder.class)
public interface CustomerOrderRepository extends DetachableJpaRepository<CustomerOrder, Long>, CustomerOrderRepositoryCustom {
}
