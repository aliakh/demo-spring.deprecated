package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.SoldProductDataOnDemand;

/**
 * = SoldProductRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = SoldProductRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = SoldProductDataOnDemand.class)
public class SoldProductRepositoryIT {
}
