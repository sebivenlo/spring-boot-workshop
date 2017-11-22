package sebivenlo.workshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sebivenlo.workshop.repository.AccountRepository;

/**
 * AccountService makes use of AccountRepository to retrieve and process data.
 *
 * @author merve
 */
@Service
public class AccountService {

    //TODO 1.4.0: apply dependency injection here
    private AccountRepository accountRepository;

    /**
     * Checks whether a user with these credentials exists.
     * 
     * @param mail Email
     * @param password Password
     * @return true if user exists other false
     */
    public boolean hasUser(String mail, String password) {
        //TODO 1.4.1: implement logic
        
        return true;
    }

}
