package com.springsource.petclinic.service.api;
import com.springsource.petclinic.model.Vet;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = VetService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Vet.class)
public interface VetService extends EntityResolver<Vet, Long>, ValidatorService<Vet> {
}
