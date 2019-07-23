package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.model.dod.ReportDataOnDemand;

/**
 * = ReportRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ReportRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ReportDataOnDemand.class)
public class ReportRepositoryIT {
}
