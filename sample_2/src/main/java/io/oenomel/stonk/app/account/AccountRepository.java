package io.oenomel.stonk.app.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>, AccountCustomRepository {

    AccountEntity findByAccountNumber(String accountNumber);
}
