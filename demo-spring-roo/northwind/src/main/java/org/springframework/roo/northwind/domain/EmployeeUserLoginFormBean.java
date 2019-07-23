package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * = EmployeeUserLoginFormBean
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class EmployeeUserLoginFormBean {

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
    @NotNull
    @Size(max = 50)
    private String firstName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 120)
    private String lastName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 120)
    private String title;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @DateTimeFormat(style = "M-")
    private Calendar birthDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @DateTimeFormat(style = "M-")
    private Calendar hireDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 50)
    private String extension;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 3500)
    private String notes;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private Employee supervisor;

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
