package com.chatt.app.chatroamapp.SecConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class SecurityConfigPrivate {
    
    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user=User.withDefaultPasswordEncoder()
        .username("laju")
        .password("null")
        .roles("USER")
        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
