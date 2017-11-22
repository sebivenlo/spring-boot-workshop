package sebivenlo.workshop.security;

import sebivenlo.workshop.entity.Account;
import sebivenlo.workshop.repository.AccountRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sebivenlo.workshop.entity.UserRole;

/**
 *
 * @author merve
 */
@Service
public class CustomUserDetailService implements UserDetailsService {
  
    @Autowired
    private AccountRepository accountRepository;
    
    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        //TODO 3.1.0 retrieve account by mail and return an instance of UserDetails
        Optional<Account> optA = null;

        if (optA.isPresent()) {
            
            return null;
        } else {
            throw new UsernameNotFoundException("Could not find User: " + mail);
        }
    }

}
