package org.eylem.mybank.repository;

import org.eylem.mybank.entity.Customer;
import org.eylem.mybank.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

public interface AccountRepo extends CrudRepository<Account, UUID> {
    Account deleteAccountById(UUID id);
    List<Account> getAllAccounts();
    Optional<Account> findById(UUID id);
    Optional<Account> findByCustomer(Customer customer);
    Optional<Account> getByIban(String iban);
}
