// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.domain;

import java.math.BigDecimal;
import org.springframework.roo.northwind.domain.ProductProjection;

privileged aspect ProductProjection_Roo_JavaBean {
    
    /**
     * Gets productId value
     * 
     * @return Long
     */
    public Long ProductProjection.getProductId() {
        return this.productId;
    }
    
    /**
     * Gets categoryId value
     * 
     * @return Long
     */
    public Long ProductProjection.getCategoryId() {
        return this.categoryId;
    }
    
    /**
     * Gets supplierId value
     * 
     * @return Long
     */
    public Long ProductProjection.getSupplierId() {
        return this.supplierId;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String ProductProjection.getCode() {
        return this.code;
    }
    
    /**
     * Gets name value
     * 
     * @return String
     */
    public String ProductProjection.getName() {
        return this.name;
    }
    
    /**
     * Gets supplierCompanyName value
     * 
     * @return String
     */
    public String ProductProjection.getSupplierCompanyName() {
        return this.supplierCompanyName;
    }
    
    /**
     * Gets unitCost value
     * 
     * @return BigDecimal
     */
    public BigDecimal ProductProjection.getUnitCost() {
        return this.unitCost;
    }
    
    /**
     * Gets unitPrice value
     * 
     * @return BigDecimal
     */
    public BigDecimal ProductProjection.getUnitPrice() {
        return this.unitPrice;
    }
    
    /**
     * Gets quantityPerUnit value
     * 
     * @return String
     */
    public String ProductProjection.getQuantityPerUnit() {
        return this.quantityPerUnit;
    }
    
    /**
     * Gets discontinued value
     * 
     * @return Boolean
     */
    public Boolean ProductProjection.getDiscontinued() {
        return this.discontinued;
    }
    
}