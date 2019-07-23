package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.CountryDataOnDemand;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;

/**
 * = CountryRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CountryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CountryDataOnDemand.class)
public class CountryRepositoryIT {
}
