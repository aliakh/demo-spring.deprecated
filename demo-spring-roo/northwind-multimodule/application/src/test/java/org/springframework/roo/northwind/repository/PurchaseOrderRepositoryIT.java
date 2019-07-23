package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.PurchaseOrderDataOnDemand;

/**
 * = PurchaseOrderRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PurchaseOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PurchaseOrderDataOnDemand.class)
public class PurchaseOrderRepositoryIT {
}
