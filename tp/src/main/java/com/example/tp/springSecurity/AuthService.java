package com.example.tp.springSecurity;
/*
import com.example.tp.Dao.MemberRepo;
import com.example.tp.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AuthService implements UserDetailsService {


    @Autowired
    private MemberRepo memberRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return this.memberRepo.findByNom(s)
                .map(user -> new Member(
                        user.getName(),
                        user.getPassword(),
                        Arrays.asList(new SimpleGrantedAuthority("member"))
                )).orElseThrow(() -> new UsernameNotFoundException("User not found"));

    }
}*/
