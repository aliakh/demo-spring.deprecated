package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Product;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = ProductRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Product.class, finders = { @RooFinder(value = "findByDiscontinuedOrderByNameAsc", returnType = Product.class) })
public interface ProductRepository extends DetachableJpaRepository<Product, Long>, ProductRepositoryCustom {
}
