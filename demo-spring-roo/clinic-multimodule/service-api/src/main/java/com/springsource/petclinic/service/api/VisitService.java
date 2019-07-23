package com.springsource.petclinic.service.api;
import com.springsource.petclinic.model.Visit;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = VisitService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Visit.class)
public interface VisitService extends EntityResolver<Visit, Long>, ValidatorService<Visit> {
}
