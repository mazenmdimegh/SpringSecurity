package org.sid.produit.service;
/*
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.sid.produit.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AppUser user=accountService.findUserByUsername(username);
        if (user==null) throw new UsernameNotFoundException(username);
        collection<GrantedAuthority> authorities=new ArrayList<>();
        user.getRoles().forEach(r->{
            authorities.add(new)
        });
                add(SimpleGrantedAuthority(r.getRoleName))
        return null;
    }
}
*/