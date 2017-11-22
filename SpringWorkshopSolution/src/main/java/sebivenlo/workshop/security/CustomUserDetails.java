package sebivenlo.workshop.security;

import sebivenlo.workshop.entity.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

    private final Account account;
    
    public CustomUserDetails(Account account){
        this.account = account;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {       
        List<GrantedAuthority> list = new ArrayList<>();
        
        //TODO 3.2.0 retrieve permissions, NOTE: prepend permissions with 'ROLE_'
        // HINT: use SimpleGrantedAuthority
        
        list.add(new SimpleGrantedAuthority("ROLE_"+account.getRoleId().getRole()));
        return list;
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getMail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
