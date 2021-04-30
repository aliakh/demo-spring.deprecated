// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.domain;

import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.roo.northwind.domain.City;
import org.springframework.roo.northwind.domain.CustomerOrder;
import org.springframework.roo.northwind.domain.Party;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.domain.Store;
import org.springframework.roo.northwind.domain.Supplier;
import org.springframework.util.Assert;

privileged aspect Region_Roo_Jpa_Entity {
    
    declare @type: Region: @Entity;
    
    declare @type: Region: @Table(name = "NW_REGIONS");
    
    declare @type: Region: @EntityFormat;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Region.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Region.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param citiesToAdd
     */
    public void Region.addToCities(Iterable<City> citiesToAdd) {
        Assert.notNull(citiesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (City item : citiesToAdd) {
            this.cities.add(item);
            item.setRegion(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param citiesToRemove
     */
    public void Region.removeFromCities(Iterable<City> citiesToRemove) {
        Assert.notNull(citiesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (City item : citiesToRemove) {
            this.cities.remove(item);
            item.setRegion(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partiesToAdd
     */
    public void Region.addToParties(Iterable<Party> partiesToAdd) {
        Assert.notNull(partiesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Party item : partiesToAdd) {
            this.parties.add(item);
            item.setRegion(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partiesToRemove
     */
    public void Region.removeFromParties(Iterable<Party> partiesToRemove) {
        Assert.notNull(partiesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Party item : partiesToRemove) {
            this.parties.remove(item);
            item.setRegion(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrdersToAdd
     */
    public void Region.addToCustomerOrders(Iterable<CustomerOrder> customerOrdersToAdd) {
        Assert.notNull(customerOrdersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (CustomerOrder item : customerOrdersToAdd) {
            this.customerOrders.add(item);
            item.setRegion(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrdersToRemove
     */
    public void Region.removeFromCustomerOrders(Iterable<CustomerOrder> customerOrdersToRemove) {
        Assert.notNull(customerOrdersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (CustomerOrder item : customerOrdersToRemove) {
            this.customerOrders.remove(item);
            item.setRegion(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storesToAdd
     */
    public void Region.addToStores(Iterable<Store> storesToAdd) {
        Assert.notNull(storesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Store item : storesToAdd) {
            this.stores.add(item);
            item.setRegion(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storesToRemove
     */
    public void Region.removeFromStores(Iterable<Store> storesToRemove) {
        Assert.notNull(storesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Store item : storesToRemove) {
            this.stores.remove(item);
            item.setRegion(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param suppliersToAdd
     */
    public void Region.addToSuppliers(Iterable<Supplier> suppliersToAdd) {
        Assert.notNull(suppliersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Supplier item : suppliersToAdd) {
            this.suppliers.add(item);
            item.setRegion(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param suppliersToRemove
     */
    public void Region.removeFromSuppliers(Iterable<Supplier> suppliersToRemove) {
        Assert.notNull(suppliersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Supplier item : suppliersToRemove) {
            this.suppliers.remove(item);
            item.setRegion(null);
        }
    }
    
}