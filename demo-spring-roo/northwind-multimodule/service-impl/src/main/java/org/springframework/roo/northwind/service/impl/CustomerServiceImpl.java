package org.springframework.roo.northwind.service.impl;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import org.springframework.roo.northwind.service.api.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * = CustomerServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = CustomerService.class)
public class CustomerServiceImpl implements CustomerService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Autowired
    private JavaMailSender mailSender;
}
