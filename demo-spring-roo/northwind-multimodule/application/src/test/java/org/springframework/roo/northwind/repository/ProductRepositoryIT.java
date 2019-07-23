package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.ProductDataOnDemand;

/**
 * = ProductRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ProductRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ProductDataOnDemand.class)
public class ProductRepositoryIT {
}
