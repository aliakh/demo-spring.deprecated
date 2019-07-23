package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.CustomerDataOnDemand;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;

/**
 * = CustomerRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerDataOnDemand.class)
public class CustomerRepositoryIT {
}
