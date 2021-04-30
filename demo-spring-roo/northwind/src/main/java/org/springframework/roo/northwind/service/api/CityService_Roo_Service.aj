// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.service.api;

import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.roo.northwind.domain.City;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.service.api.CityService;

privileged aspect CityService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return City
     */
    public abstract City CityService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     */
    public abstract void CityService.delete(City city);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<City> CityService.save(Iterable<City> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void CityService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return City
     */
    public abstract City CityService.save(City entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return City
     */
    public abstract City CityService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<City> CityService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<City> CityService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long CityService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<City> CityService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<City> CityService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param customerOrdersToAdd
     * @return City
     */
    public abstract City CityService.addToCustomerOrders(City city, Iterable<Long> customerOrdersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param customerOrdersToRemove
     * @return City
     */
    public abstract City CityService.removeFromCustomerOrders(City city, Iterable<Long> customerOrdersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param customerOrders
     * @return City
     */
    public abstract City CityService.setCustomerOrders(City city, Iterable<Long> customerOrders);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param partiesToAdd
     * @return City
     */
    public abstract City CityService.addToParties(City city, Iterable<Long> partiesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param partiesToRemove
     * @return City
     */
    public abstract City CityService.removeFromParties(City city, Iterable<Long> partiesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param parties
     * @return City
     */
    public abstract City CityService.setParties(City city, Iterable<Long> parties);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param storesToAdd
     * @return City
     */
    public abstract City CityService.addToStores(City city, Iterable<Long> storesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param storesToRemove
     * @return City
     */
    public abstract City CityService.removeFromStores(City city, Iterable<Long> storesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param stores
     * @return City
     */
    public abstract City CityService.setStores(City city, Iterable<Long> stores);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param suppliersToAdd
     * @return City
     */
    public abstract City CityService.addToSuppliers(City city, Iterable<Long> suppliersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param suppliersToRemove
     * @return City
     */
    public abstract City CityService.removeFromSuppliers(City city, Iterable<Long> suppliersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param suppliers
     * @return City
     */
    public abstract City CityService.setSuppliers(City city, Iterable<Long> suppliers);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<City> CityService.findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return Long
     */
    public abstract long CityService.countByRegion(Region region);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param pageable
     * @return Page
     */
    public abstract Page<City> CityService.findByRegionIdOrderByDescriptionAsc(Long id, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Long
     */
    public abstract long CityService.countByRegionIdOrderByDescriptionAsc(Long id);
    
}