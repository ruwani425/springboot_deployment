package com.pm.spbootdeployment.repo;

import com.pm.spbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Lucky Prabath
 * @since 2025-08-04
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
