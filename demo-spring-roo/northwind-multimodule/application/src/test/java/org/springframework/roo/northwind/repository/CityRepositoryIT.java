package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.CityDataOnDemand;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;

/**
 * = CityRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CityRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CityDataOnDemand.class)
public class CityRepositoryIT {
}
