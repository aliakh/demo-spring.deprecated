// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.disid.restful.web;

import com.disid.restful.model.CustomerOrder;
import com.disid.restful.web.CustomerJsonMixin;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import java.util.Set;

privileged aspect CustomerJsonMixin_Roo_JSONMixin {
    
    declare @type: CustomerJsonMixin: @JsonIdentityInfo(generator = PropertyGenerator.class, property = "id");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<CustomerOrder> CustomerJsonMixin.orders;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<CustomerOrder> CustomerJsonMixin.getOrders() {
        return orders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orders
     */
    public void CustomerJsonMixin.setOrders(Set<CustomerOrder> orders) {
        this.orders = orders;
    }
    
}