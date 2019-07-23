package org.springframework.roo.northwind.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;

/**
 * = InboxMailMessageBean
 TODO Auto-generated class documentation
 *
 */
@RooDTO(immutable = true)
@RooJavaBean(settersByDefault = false)
public class InboxMailMessageBean {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String subject;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String content;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String from;
}
