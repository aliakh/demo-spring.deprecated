package com.disid.restful.service.api;
import com.disid.restful.model.CustomerOrder;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CustomerOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CustomerOrder.class)
public interface CustomerOrderService extends EntityResolver<CustomerOrder, Long>, ValidatorService<CustomerOrder> {
}
