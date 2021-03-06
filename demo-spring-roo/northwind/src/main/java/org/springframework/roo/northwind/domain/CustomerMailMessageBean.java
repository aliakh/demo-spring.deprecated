package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = CustomerMailMessageBean
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class CustomerMailMessageBean {

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
    private String companyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String message;
}
