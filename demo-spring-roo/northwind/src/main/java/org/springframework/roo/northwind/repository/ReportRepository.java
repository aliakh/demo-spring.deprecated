package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Report;

/**
 * = ReportRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Report.class)
public interface ReportRepository extends DetachableJpaRepository<Report, Long>, ReportRepositoryCustom {
}
