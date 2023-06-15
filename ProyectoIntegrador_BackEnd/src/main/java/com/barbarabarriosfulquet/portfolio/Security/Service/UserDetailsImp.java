package com.barbarabarriosfulquet.portfolio.Security.Service;

import com.barbarabarriosfulquet.portfolio.Security.Entity.MainUser;
import com.barbarabarriosfulquet.portfolio.Security.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService{
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String UserName) throws UsernameNotFoundException {
        User user = userService.getByUserName(UserName).get();
        return MainUser.build(user);
    }
}
