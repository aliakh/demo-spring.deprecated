package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = InventoryProjection
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class InventoryProjection {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long productId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String name;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer unitsInStock;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer assignedStock;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer availableStock;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer reorderLevel;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer replenishStock;
}
