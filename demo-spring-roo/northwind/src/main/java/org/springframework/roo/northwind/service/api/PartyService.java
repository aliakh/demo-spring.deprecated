package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.Party;

/**
 * = PartyService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Party.class)
public interface PartyService extends EntityResolver<Party, Long>, ValidatorService<Party> {
}
