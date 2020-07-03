package com.yorosoft.ebanking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * SecurityConfig
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    private static final String[] PUBLIC_MATCHERS = {
        "/css/**",
        "/image/**",
        "/js/**",
        "/login"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests().antMatchers(PUBLIC_MATCHERS).permitAll().anyRequest().authenticated()
            .and()
            .csrf().disable().cors().disable().formLogin().failureUrl("/login?error").defaultSuccessUrl("/dashboard").loginPage("/login").permitAll()
            .and()
            .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout").permitAll();
    }

    
}
