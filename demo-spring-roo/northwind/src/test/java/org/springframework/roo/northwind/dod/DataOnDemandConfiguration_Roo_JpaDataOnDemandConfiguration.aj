// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.dod;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.roo.northwind.dod.DataOnDemandConfiguration;
import org.springframework.roo.northwind.domain.dod.CategoryDataOnDemand;
import org.springframework.roo.northwind.domain.dod.CustomerOrderDataOnDemand;

privileged aspect DataOnDemandConfiguration_Roo_JpaDataOnDemandConfiguration {
    
    declare @type: DataOnDemandConfiguration: @TestConfiguration;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EntityManager DataOnDemandConfiguration.entityManager;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param entityManager
     */
    @Autowired
    public DataOnDemandConfiguration.new(EntityManager entityManager) {
        setEntityManager(entityManager);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EntityManager
     */
    public EntityManager DataOnDemandConfiguration.getEntityManager() {
        return entityManager;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entityManager
     */
    public void DataOnDemandConfiguration.setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CategoryDataOnDemand
     */
    @Bean
    public CategoryDataOnDemand DataOnDemandConfiguration.categoryDataOnDemand() {
        return new CategoryDataOnDemand(getEntityManager());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerOrderDataOnDemand
     */
    @Bean
    public CustomerOrderDataOnDemand DataOnDemandConfiguration.customerOrderDataOnDemand() {
        return new CustomerOrderDataOnDemand(getEntityManager());
    }
    
}