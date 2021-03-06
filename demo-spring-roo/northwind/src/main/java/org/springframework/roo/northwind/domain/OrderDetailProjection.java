package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import java.math.BigDecimal;

/**
 * = OrderDetailProjection
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class OrderDetailProjection {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long orderDetailId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerOrderId;

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
    private String productName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer quantity;

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
    @NumberFormat
    private BigDecimal discount;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal total;
}
