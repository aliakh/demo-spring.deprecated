package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.ShipperDataOnDemand;

/**
 * = ShipperRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ShipperRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ShipperDataOnDemand.class)
public class ShipperRepositoryIT {
}
