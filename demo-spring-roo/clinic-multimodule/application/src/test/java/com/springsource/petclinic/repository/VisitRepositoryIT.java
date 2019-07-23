package com.springsource.petclinic.repository;
import com.springsource.petclinic.model.dod.DataOnDemandConfiguration;
import com.springsource.petclinic.model.dod.VisitDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = VisitRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = VisitRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = VisitDataOnDemand.class)
public class VisitRepositoryIT {
}
