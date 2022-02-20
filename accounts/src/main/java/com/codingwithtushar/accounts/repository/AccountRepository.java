package com.codingwithtushar.accounts.repository;

import com.codingwithtushar.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
