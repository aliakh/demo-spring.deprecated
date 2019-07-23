package com.springsource.petclinic.repository;
import com.springsource.petclinic.model.dod.DataOnDemandConfiguration;
import com.springsource.petclinic.model.dod.VetDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = VetRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = VetRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = VetDataOnDemand.class)
public class VetRepositoryIT {
}
