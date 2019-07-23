package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import org.springframework.roo.northwind.model.dod.CategoryDataOnDemand;
import org.springframework.roo.northwind.model.dod.DataOnDemandConfiguration;

/**
 * = CategoryRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CategoryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CategoryDataOnDemand.class)
public class CategoryRepositoryIT {
}
