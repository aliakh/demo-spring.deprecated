package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.PartyDataOnDemand;

/**
 * = PartyRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PartyRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PartyDataOnDemand.class)
public class PartyRepositoryIT {
}
