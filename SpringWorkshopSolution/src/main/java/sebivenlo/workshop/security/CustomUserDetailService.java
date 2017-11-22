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
        //TODO 3.1.0 retrieve account by mail 
        Optional<Account> optA = accountRepository.findByMailEqualsIgnoreCase(mail);

        if (optA.isPresent()) {
            return new CustomUserDetails(optA.get());
        } else {
            throw new UsernameNotFoundException("Could not find User: " + mail);
        }
    }

    private Account getTestAccount() {
        Account a = new Account();
        a.setMail("test");
        a.setPassword("test");
        UserRole u = new UserRole();
        u.setRole("USER");
        a.setRoleId(u);
        return a;
    }

}
