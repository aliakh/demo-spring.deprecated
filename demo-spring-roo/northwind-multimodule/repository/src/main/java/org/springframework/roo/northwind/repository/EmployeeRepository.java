package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.Employee;

/**
 * = EmployeeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Employee.class)
public interface EmployeeRepository extends DetachableJpaRepository<Employee, Long>, EmployeeRepositoryCustom {
}
