// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.service.impl;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.roo.northwind.domain.City;
import org.springframework.roo.northwind.domain.Country;
import org.springframework.roo.northwind.domain.Product;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.domain.Supplier;
import org.springframework.roo.northwind.repository.SupplierRepository;
import org.springframework.roo.northwind.service.api.ProductService;
import org.springframework.roo.northwind.service.impl.SupplierServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect SupplierServiceImpl_Roo_Service_Impl {
    
    declare @type: SupplierServiceImpl: @Service;
    
    declare @type: SupplierServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private SupplierRepository SupplierServiceImpl.supplierRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProductService SupplierServiceImpl.productService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param supplierRepository
     * @param productService
     */
    @Autowired
    public SupplierServiceImpl.new(SupplierRepository supplierRepository, @Lazy ProductService productService) {
        setSupplierRepository(supplierRepository);
        setProductService(productService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return SupplierRepository
     */
    public SupplierRepository SupplierServiceImpl.getSupplierRepository() {
        return supplierRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplierRepository
     */
    public void SupplierServiceImpl.setSupplierRepository(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProductService
     */
    public ProductService SupplierServiceImpl.getProductService() {
        return productService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param productService
     */
    public void SupplierServiceImpl.setProductService(ProductService productService) {
        this.productService = productService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @return Map
     */
    public Map<String, List<MessageI18n>> SupplierServiceImpl.validate(Supplier supplier) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @param productsToAdd
     * @return Supplier
     */
    @Transactional
    public Supplier SupplierServiceImpl.addToProducts(Supplier supplier, Iterable<Long> productsToAdd) {
        List<Product> products = getProductService().findAll(productsToAdd);
        supplier.addToProducts(products);
        return getSupplierRepository().save(supplier);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @param productsToRemove
     * @return Supplier
     */
    @Transactional
    public Supplier SupplierServiceImpl.removeFromProducts(Supplier supplier, Iterable<Long> productsToRemove) {
        List<Product> products = getProductService().findAll(productsToRemove);
        supplier.removeFromProducts(products);
        return getSupplierRepository().save(supplier);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @param products
     * @return Supplier
     */
    @Transactional
    public Supplier SupplierServiceImpl.setProducts(Supplier supplier, Iterable<Long> products) {
        List<Product> items = getProductService().findAll(products);
        Set<Product> currents = supplier.getProducts();
        Set<Product> toRemove = new HashSet<Product>();
        for (Iterator<Product> iterator = currents.iterator(); iterator.hasNext();) {
            Product nextProduct = iterator.next();
            if (items.contains(nextProduct)) {
                items.remove(nextProduct);
            } else {
                toRemove.add(nextProduct);
            }
        }
        supplier.removeFromProducts(toRemove);
        supplier.addToProducts(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        supplier.setVersion(supplier.getVersion() + 1);
        return getSupplierRepository().save(supplier);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     */
    @Transactional
    public void SupplierServiceImpl.delete(Supplier supplier) {
        // Clear bidirectional many-to-one child relationship with Country
        if (supplier.getCountry() != null) {
            supplier.getCountry().getSuppliers().remove(supplier);
        }
        
        // Clear bidirectional many-to-one child relationship with City
        if (supplier.getCity() != null) {
            supplier.getCity().getSuppliers().remove(supplier);
        }
        
        // Clear bidirectional many-to-one child relationship with Region
        if (supplier.getRegion() != null) {
            supplier.getRegion().getSuppliers().remove(supplier);
        }
        
        // Clear bidirectional one-to-many parent relationship with Product
        for (Product item : supplier.getProducts()) {
            item.setSupplier(null);
        }
        
        getSupplierRepository().delete(supplier);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<Supplier> SupplierServiceImpl.save(Iterable<Supplier> entities) {
        return getSupplierRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void SupplierServiceImpl.delete(Iterable<Long> ids) {
        List<Supplier> toDelete = getSupplierRepository().findAll(ids);
        getSupplierRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Supplier
     */
    @Transactional
    public Supplier SupplierServiceImpl.save(Supplier entity) {
        return getSupplierRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Supplier
     */
    public Supplier SupplierServiceImpl.findOne(Long id) {
        return getSupplierRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Supplier
     */
    public Supplier SupplierServiceImpl.findOneForUpdate(Long id) {
        return getSupplierRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<Supplier> SupplierServiceImpl.findAll(Iterable<Long> ids) {
        return getSupplierRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<Supplier> SupplierServiceImpl.findAll() {
        return getSupplierRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long SupplierServiceImpl.count() {
        return getSupplierRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Supplier> SupplierServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getSupplierRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Supplier> SupplierServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getSupplierRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Supplier> SupplierServiceImpl.findByCity(City city, GlobalSearch globalSearch, Pageable pageable) {
        return getSupplierRepository().findByCity(city, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Supplier> SupplierServiceImpl.findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable) {
        return getSupplierRepository().findByCountry(country, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Supplier> SupplierServiceImpl.findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
        return getSupplierRepository().findByRegion(region, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @return Long
     */
    public long SupplierServiceImpl.countByCity(City city) {
        return getSupplierRepository().countByCity(city);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @return Long
     */
    public long SupplierServiceImpl.countByCountry(Country country) {
        return getSupplierRepository().countByCountry(country);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return Long
     */
    public long SupplierServiceImpl.countByRegion(Region region) {
        return getSupplierRepository().countByRegion(region);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Supplier> SupplierServiceImpl.getEntityType() {
        return Supplier.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> SupplierServiceImpl.getIdType() {
        return Long.class;
    }
    
}
