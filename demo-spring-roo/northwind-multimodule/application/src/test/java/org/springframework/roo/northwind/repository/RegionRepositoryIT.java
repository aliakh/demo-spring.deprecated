package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.RegionDataOnDemand;

/**
 * = RegionRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = RegionRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = RegionDataOnDemand.class)
public class RegionRepositoryIT {
}
