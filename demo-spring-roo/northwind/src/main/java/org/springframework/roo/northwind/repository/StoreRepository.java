package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Store;

/**
 * = StoreRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Store.class)
public interface StoreRepository extends DetachableJpaRepository<Store, Long>, StoreRepositoryCustom {
}
