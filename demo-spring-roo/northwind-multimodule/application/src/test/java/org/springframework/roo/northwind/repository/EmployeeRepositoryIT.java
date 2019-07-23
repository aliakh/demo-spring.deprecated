package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.EmployeeDataOnDemand;

/**
 * = EmployeeRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = EmployeeRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = EmployeeDataOnDemand.class)
public class EmployeeRepositoryIT {
}
