package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.StoreDataOnDemand;

/**
 * = StoreRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = StoreRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = StoreDataOnDemand.class)
public class StoreRepositoryIT {
}
