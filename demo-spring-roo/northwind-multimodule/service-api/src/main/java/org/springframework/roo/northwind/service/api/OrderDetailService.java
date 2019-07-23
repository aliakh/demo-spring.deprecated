package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.OrderDetail;

/**
 * = OrderDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OrderDetail.class)
public interface OrderDetailService extends EntityResolver<OrderDetail, Long>, ValidatorService<OrderDetail> {
}
