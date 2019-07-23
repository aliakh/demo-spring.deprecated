package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Region;

/**
 * = RegionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Region.class)
public interface RegionService extends EntityResolver<Region, Long>, ValidatorService<Region> {
}
