package com.disid.restful.service.api;
import com.disid.restful.model.Customer;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CustomerService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Customer.class)
public interface CustomerService extends EntityResolver<Customer, Long>, ValidatorService<Customer> {
}
