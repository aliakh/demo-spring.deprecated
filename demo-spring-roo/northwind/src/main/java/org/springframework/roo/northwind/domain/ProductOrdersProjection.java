package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import java.math.BigDecimal;

/**
 * = ProductOrdersProjection
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class ProductOrdersProjection {

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
    @NumberFormat
    private Long categoryId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long supplierId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String code;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String name;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String supplierCompanyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal unitCost;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal unitPrice;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String quantityPerUnit;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private Boolean discontinued;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long purchaseOrdersCount;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long orderDetailsCount;
}
