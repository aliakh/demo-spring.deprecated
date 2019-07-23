package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.CustomerOrderDataOnDemand;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;

/**
 * = CustomerOrderRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerOrderDataOnDemand.class)
public class CustomerOrderRepositoryIT {
}
