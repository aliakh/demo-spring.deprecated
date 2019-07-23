package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Party;

/**
 * = PartyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Party.class)
public interface PartyRepository extends DetachableJpaRepository<Party, Long>, PartyRepositoryCustom {
}
