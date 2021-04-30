// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.disid.restful.service.api;

import com.disid.restful.model.Category;
import com.disid.restful.model.Product;
import com.disid.restful.service.api.ProductService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ProductService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Product
     */
    public abstract Product ProductService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     */
    public abstract void ProductService.delete(Product product);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Product> ProductService.save(Iterable<Product> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ProductService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Product
     */
    public abstract Product ProductService.save(Product entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Product
     */
    public abstract Product ProductService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Product> ProductService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Product> ProductService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ProductService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetailsToAdd
     * @return Product
     */
    public abstract Product ProductService.addToOrderDetails(Product product, Iterable<Long> orderDetailsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetailsToRemove
     * @return Product
     */
    public abstract Product ProductService.removeFromOrderDetails(Product product, Iterable<Long> orderDetailsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetails
     * @return Product
     */
    public abstract Product ProductService.setOrderDetails(Product product, Iterable<Long> orderDetails);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param categories
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findByCategoriesContains(Category categories, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param categories
     * @return Long
     */
    public abstract long ProductService.countByCategoriesContains(Category categories);
    
}