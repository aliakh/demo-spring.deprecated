// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.roo.northwind.model.City;
import org.springframework.roo.northwind.model.QCity;
import org.springframework.roo.northwind.model.Region;
import org.springframework.roo.northwind.repository.CityRepositoryImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect CityRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: CityRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CityRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CityRepositoryImpl.REGION = "region";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<City> CityRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QCity city = QCity.city;
        
        JPQLQuery<City> query = from(city);
        
        Path<?>[] paths = new Path<?>[] {city.description,city.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, city.description)
			.map(REGION, city.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, city);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<City> CityRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QCity city = QCity.city;
        
        JPQLQuery<City> query = from(city);
        
        Path<?>[] paths = new Path<?>[] {city.description,city.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(city.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, city.description)
			.map(REGION, city.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, city);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<City> CityRepositoryImpl.findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
        
        QCity city = QCity.city;
        
        JPQLQuery<City> query = from(city);
        
        Assert.notNull(region, "region is required");
        
        query.where(city.region.eq(region));
        Path<?>[] paths = new Path<?>[] {city.description,city.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, city.description)
			.map(REGION, city.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, city);
    }
    
}
