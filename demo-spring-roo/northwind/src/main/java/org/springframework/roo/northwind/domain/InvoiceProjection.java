package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;

/**
 * = InvoiceProjection
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class InvoiceProjection {

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
    private Long shipCountryId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long shipRegionId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long shipCityId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerCountryId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerRegionId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerCityId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long employeeId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long shippedId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @DateTimeFormat(style = "M-")
    private Calendar invoiceDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipAddress;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipCountryDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipRegionDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipCityDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipPostalCode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerCompanyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerCountryDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerRegionDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerCityDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerPostalCode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @DateTimeFormat(style = "M-")
    private Calendar orderDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @DateTimeFormat(style = "M-")
    private Calendar shippedDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String employeeName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String shipperCompanyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal freight;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal subtotal;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal total;
}
