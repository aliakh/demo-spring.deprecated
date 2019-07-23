package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = UserCertificateDniMessageBean
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class UserCertificateDniMessageBean {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private int status;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String statusMsg;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String dni;
}
