package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Shipper;

/**
 * = ShipperService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Shipper.class)
public interface ShipperService extends EntityResolver<Shipper, Long>, ValidatorService<Shipper> {
}
