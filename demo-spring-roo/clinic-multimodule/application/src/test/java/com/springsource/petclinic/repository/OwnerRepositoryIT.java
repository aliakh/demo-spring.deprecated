package com.springsource.petclinic.repository;
import com.springsource.petclinic.model.dod.DataOnDemandConfiguration;
import com.springsource.petclinic.model.dod.OwnerDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = OwnerRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = OwnerRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = OwnerDataOnDemand.class)
public class OwnerRepositoryIT {
}
