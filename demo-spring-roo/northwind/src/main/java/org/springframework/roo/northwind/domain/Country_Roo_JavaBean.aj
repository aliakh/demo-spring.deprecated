// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.domain;

import java.util.Objects;
import java.util.Set;
import org.springframework.roo.northwind.domain.Country;
import org.springframework.roo.northwind.domain.CustomerOrder;
import org.springframework.roo.northwind.domain.Party;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.domain.Store;
import org.springframework.roo.northwind.domain.Supplier;

privileged aspect Country_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Country.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Country
     */
    public Country Country.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long Country.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Country
     */
    public Country Country.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String Country.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return Country
     */
    public Country Country.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets parties value
     * 
     * @return Set
     */
    public Set<Party> Country.getParties() {
        return this.parties;
    }
    
    /**
     * Sets parties value
     * 
     * @param parties
     * @return Country
     */
    public Country Country.setParties(Set<Party> parties) {
        this.parties = parties;
        return this;
    }
    
    /**
     * Gets regions value
     * 
     * @return Set
     */
    public Set<Region> Country.getRegions() {
        return this.regions;
    }
    
    /**
     * Sets regions value
     * 
     * @param regions
     * @return Country
     */
    public Country Country.setRegions(Set<Region> regions) {
        this.regions = regions;
        return this;
    }
    
    /**
     * Gets customerOrders value
     * 
     * @return Set
     */
    public Set<CustomerOrder> Country.getCustomerOrders() {
        return this.customerOrders;
    }
    
    /**
     * Sets customerOrders value
     * 
     * @param customerOrders
     * @return Country
     */
    public Country Country.setCustomerOrders(Set<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
        return this;
    }
    
    /**
     * Gets stores value
     * 
     * @return Set
     */
    public Set<Store> Country.getStores() {
        return this.stores;
    }
    
    /**
     * Sets stores value
     * 
     * @param stores
     * @return Country
     */
    public Country Country.setStores(Set<Store> stores) {
        this.stores = stores;
        return this;
    }
    
    /**
     * Gets suppliers value
     * 
     * @return Set
     */
    public Set<Supplier> Country.getSuppliers() {
        return this.suppliers;
    }
    
    /**
     * Sets suppliers value
     * 
     * @param suppliers
     * @return Country
     */
    public Country Country.setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Country.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Country)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Country) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Country.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Country.toString() {
        return "Country {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", description='" + description + '\'' + "}" + super.toString();
    }
    
}