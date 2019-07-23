package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.SupplierDataOnDemand;

/**
 * = SupplierRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = SupplierRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = SupplierDataOnDemand.class)
public class SupplierRepositoryIT {
}
