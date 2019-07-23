package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.CustomerOrder;

/**
 * = CustomerOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CustomerOrder.class)
public interface CustomerOrderService extends EntityResolver<CustomerOrder, Long>, ValidatorService<CustomerOrder> {
}
