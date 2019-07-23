package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * = CustomerUserLoginFormBean
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class CustomerUserLoginFormBean {

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
    @NotNull
    @Size(max = 50)
    private String companyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 100)
    private String contactName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Size(max = 80)
    private String contactTitle;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 80)
    private String email;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 200)
    private String address;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    private City city;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    private Region region;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    private Country country;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 6)
    private String postalCode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Size(max = 15)
    private String phone;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Size(max = 15)
    private String fax;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 30)
    private String username;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(min = 8, max = 128)
    private String password;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(min = 8, max = 128)
    private String repeatPassword;
}
