// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.disid.restful.service.impl;

import com.disid.restful.model.CustomerOrder;
import com.disid.restful.model.OrderDetail;
import com.disid.restful.model.Product;
import com.disid.restful.repository.OrderDetailRepository;
import com.disid.restful.service.impl.OrderDetailServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect OrderDetailServiceImpl_Roo_Service_Impl {
    
    declare @type: OrderDetailServiceImpl: @Service;
    
    declare @type: OrderDetailServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OrderDetailRepository OrderDetailServiceImpl.orderDetailRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param orderDetailRepository
     */
    @Autowired
    public OrderDetailServiceImpl.new(OrderDetailRepository orderDetailRepository) {
        setOrderDetailRepository(orderDetailRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return OrderDetailRepository
     */
    public OrderDetailRepository OrderDetailServiceImpl.getOrderDetailRepository() {
        return orderDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderDetailRepository
     */
    public void OrderDetailServiceImpl.setOrderDetailRepository(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderdetail
     * @return Map
     */
    public Map<String, List<MessageI18n>> OrderDetailServiceImpl.validate(OrderDetail orderdetail) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return OrderDetail
     */
    @Transactional
    public OrderDetail OrderDetailServiceImpl.save(OrderDetail entity) {
        return getOrderDetailRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return OrderDetail
     */
    public OrderDetail OrderDetailServiceImpl.findOne(Long id) {
        return getOrderDetailRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return OrderDetail
     */
    public OrderDetail OrderDetailServiceImpl.findOneForUpdate(Long id) {
        return getOrderDetailRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<OrderDetail> OrderDetailServiceImpl.findAll(Iterable<Long> ids) {
        return getOrderDetailRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<OrderDetail> OrderDetailServiceImpl.findByCustomerOrder(CustomerOrder customerOrder, GlobalSearch globalSearch, Pageable pageable) {
        return getOrderDetailRepository().findByCustomerOrder(customerOrder, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<OrderDetail> OrderDetailServiceImpl.findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable) {
        return getOrderDetailRepository().findByProduct(product, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @return Long
     */
    public long OrderDetailServiceImpl.countByCustomerOrder(CustomerOrder customerOrder) {
        return getOrderDetailRepository().countByCustomerOrder(customerOrder);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @return Long
     */
    public long OrderDetailServiceImpl.countByProduct(Product product) {
        return getOrderDetailRepository().countByProduct(product);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<OrderDetail> OrderDetailServiceImpl.getEntityType() {
        return OrderDetail.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> OrderDetailServiceImpl.getIdType() {
        return Long.class;
    }
    
}
