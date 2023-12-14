package com.yosra.ebanking_backend.repositories;

import com.yosra.ebanking_backend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {

}
