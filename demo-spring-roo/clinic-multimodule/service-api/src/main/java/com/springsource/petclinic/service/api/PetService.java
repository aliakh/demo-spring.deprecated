package com.springsource.petclinic.service.api;
import com.springsource.petclinic.model.Pet;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PetService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Pet.class)
public interface PetService extends EntityResolver<Pet, Long>, ValidatorService<Pet> {
}
