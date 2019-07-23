package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.PurchaseOrder;

/**
 * = PurchaseOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PurchaseOrder.class)
public interface PurchaseOrderService extends EntityResolver<PurchaseOrder, Long>, ValidatorService<PurchaseOrder> {
}
