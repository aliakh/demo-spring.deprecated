package com.springsource.petclinic.repository;
import com.springsource.petclinic.model.dod.DataOnDemandConfiguration;
import com.springsource.petclinic.model.dod.PetDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = PetRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PetRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PetDataOnDemand.class)
public class PetRepositoryIT {
}
