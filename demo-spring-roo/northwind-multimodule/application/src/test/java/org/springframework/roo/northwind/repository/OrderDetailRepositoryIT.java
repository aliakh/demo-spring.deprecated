package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.OrderDetailDataOnDemand;

/**
 * = OrderDetailRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = OrderDetailRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = OrderDetailDataOnDemand.class)
public class OrderDetailRepositoryIT {
}
