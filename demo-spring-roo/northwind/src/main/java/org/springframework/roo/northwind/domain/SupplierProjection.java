package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = SupplierProjection
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class SupplierProjection {

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
    @NumberFormat
    private Long countryId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long regionId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long cityId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String companyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String contactName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String contactTitle;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String address;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String countryDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String regionDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String cityDescription;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String postalCode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String phone;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String fax;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String web;
}
