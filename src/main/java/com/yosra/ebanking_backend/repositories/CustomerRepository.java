package com.yosra.ebanking_backend.repositories;

import com.yosra.ebanking_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
