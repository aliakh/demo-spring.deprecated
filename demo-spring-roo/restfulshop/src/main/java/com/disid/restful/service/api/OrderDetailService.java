package com.disid.restful.service.api;
import com.disid.restful.model.OrderDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OrderDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OrderDetail.class)
public interface OrderDetailService extends EntityResolver<OrderDetail, Long>, ValidatorService<OrderDetail> {
}
