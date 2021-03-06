// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;
import org.springframework.roo.northwind.domain.Employee;
import org.springframework.roo.northwind.domain.Product;
import org.springframework.roo.northwind.domain.PurchaseOrder;

privileged aspect PurchaseOrder_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long PurchaseOrder.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long PurchaseOrder.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets employee value
     * 
     * @return Employee
     */
    public Employee PurchaseOrder.getEmployee() {
        return this.employee;
    }
    
    /**
     * Sets employee value
     * 
     * @param employee
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }
    
    /**
     * Gets product value
     * 
     * @return Product
     */
    public Product PurchaseOrder.getProduct() {
        return this.product;
    }
    
    /**
     * Sets product value
     * 
     * @param product
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setProduct(Product product) {
        this.product = product;
        return this;
    }
    
    /**
     * Gets unitCost value
     * 
     * @return BigDecimal
     */
    public BigDecimal PurchaseOrder.getUnitCost() {
        return this.unitCost;
    }
    
    /**
     * Sets unitCost value
     * 
     * @param unitCost
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
        return this;
    }
    
    /**
     * Gets quantity value
     * 
     * @return Integer
     */
    public Integer PurchaseOrder.getQuantity() {
        return this.quantity;
    }
    
    /**
     * Sets quantity value
     * 
     * @param quantity
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    /**
     * Gets orderDate value
     * 
     * @return Calendar
     */
    public Calendar PurchaseOrder.getOrderDate() {
        return this.orderDate;
    }
    
    /**
     * Sets orderDate value
     * 
     * @param orderDate
     * @return PurchaseOrder
     */
    public PurchaseOrder PurchaseOrder.setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
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
    public boolean PurchaseOrder.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof PurchaseOrder)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((PurchaseOrder) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int PurchaseOrder.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PurchaseOrder.toString() {
        return "PurchaseOrder {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", unitCost='" + unitCost + '\'' + 
                ", quantity='" + quantity + '\'' + 
                ", orderDate='" + orderDate == null ? null : java.text.DateFormat.getDateTimeInstance().format(orderDate.getTime()) + '\'' + "}" + super.toString();
    }
    
}
