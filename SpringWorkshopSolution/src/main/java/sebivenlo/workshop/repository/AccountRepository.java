package sebivenlo.workshop.repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import sebivenlo.workshop.entity.Account;

/**
 * Repository for querying accounts.
 * 
 * @author merve
 */
@Repository
public interface AccountRepository extends BaseRepository<Account>{
    
    //TODO 1.3.0: define method for querying accounts by mail
    //HINT: method name is relevant, check documentation

    Optional<Account> findByMailEqualsIgnoreCase(String mail);
}
