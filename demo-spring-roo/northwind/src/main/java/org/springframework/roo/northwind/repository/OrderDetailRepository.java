package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.OrderDetail;

/**
 * = OrderDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OrderDetail.class)
public interface OrderDetailRepository extends DetachableJpaRepository<OrderDetail, Long>, OrderDetailRepositoryCustom {
}
