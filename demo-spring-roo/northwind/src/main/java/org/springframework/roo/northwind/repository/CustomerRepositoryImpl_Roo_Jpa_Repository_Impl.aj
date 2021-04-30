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
import org.springframework.roo.northwind.domain.Customer;
import org.springframework.roo.northwind.domain.QCustomer;
import org.springframework.roo.northwind.repository.CustomerRepositoryImpl;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CustomerRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: CustomerRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.CITY = "city";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.COUNTRY = "country";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.ADDRESS = "address";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.POSTAL_CODE = "postalCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.PHONE = "phone";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.REGION = "region";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.COMPANY_NAME = "companyName";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.CONTACT_NAME = "contactName";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.CONTACT_TITLE = "contactTitle";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.FAX = "fax";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CustomerRepositoryImpl.EMAIL = "email";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Customer> CustomerRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QCustomer customer = QCustomer.customer;
        
        JPQLQuery<Customer> query = from(customer);
        
        Path<?>[] paths = new Path<?>[] {customer.city,customer.country,customer.address,customer.postalCode,customer.phone,customer.region,customer.companyName,customer.contactName,customer.contactTitle,customer.fax,customer.email};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, customer.city)
			.map(COUNTRY, customer.country)
			.map(ADDRESS, customer.address)
			.map(POSTAL_CODE, customer.postalCode)
			.map(PHONE, customer.phone)
			.map(REGION, customer.region)
			.map(COMPANY_NAME, customer.companyName)
			.map(CONTACT_NAME, customer.contactName)
			.map(CONTACT_TITLE, customer.contactTitle)
			.map(FAX, customer.fax)
			.map(EMAIL, customer.email);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, customer);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Customer> CustomerRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QCustomer customer = QCustomer.customer;
        
        JPQLQuery<Customer> query = from(customer);
        
        Path<?>[] paths = new Path<?>[] {customer.city,customer.country,customer.address,customer.postalCode,customer.phone,customer.region,customer.companyName,customer.contactName,customer.contactTitle,customer.fax,customer.email};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(customer.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, customer.city)
			.map(COUNTRY, customer.country)
			.map(ADDRESS, customer.address)
			.map(POSTAL_CODE, customer.postalCode)
			.map(PHONE, customer.phone)
			.map(REGION, customer.region)
			.map(COMPANY_NAME, customer.companyName)
			.map(CONTACT_NAME, customer.contactName)
			.map(CONTACT_TITLE, customer.contactTitle)
			.map(FAX, customer.fax)
			.map(EMAIL, customer.email);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, customer);
    }
    
}