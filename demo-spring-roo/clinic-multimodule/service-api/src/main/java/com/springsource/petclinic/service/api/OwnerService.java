package com.springsource.petclinic.service.api;
import com.springsource.petclinic.model.Owner;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OwnerService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Owner.class)
public interface OwnerService extends EntityResolver<Owner, Long>, ValidatorService<Owner> {
}
