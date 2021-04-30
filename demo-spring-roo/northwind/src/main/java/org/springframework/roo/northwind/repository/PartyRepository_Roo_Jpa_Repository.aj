// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.repository;

import org.springframework.roo.northwind.domain.City;
import org.springframework.roo.northwind.domain.Country;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.repository.PartyRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PartyRepository_Roo_Jpa_Repository {
    
    declare @type: PartyRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @return Long
     */
    public abstract long PartyRepository.countByCountry(Country country);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @return Long
     */
    public abstract long PartyRepository.countByCity(City city);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return Long
     */
    public abstract long PartyRepository.countByRegion(Region region);
    
}