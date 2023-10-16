package com.example.MyHouseWithSecurity.auth;

import com.example.MyHouseWithSecurity.model.authmodel.User;
import com.example.MyHouseWithSecurity.repository.UseraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UseraRepository useraRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= useraRepository.findByName(username);
        return new CustomUserDetail(user);
    }
}
