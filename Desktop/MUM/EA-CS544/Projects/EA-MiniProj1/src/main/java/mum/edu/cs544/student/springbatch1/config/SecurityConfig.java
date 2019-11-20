package mum.edu.cs544.student.springbatch1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication().withUser(users.username("user").password("user").roles("USER"));
        auth.inMemoryAuthentication().withUser(users.username("puje").password("user").roles("USER"));
        auth.inMemoryAuthentication().withUser(users.username("admin").password("admin").roles("ADMIN"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //.antMatchers("/").authenticated()
                .antMatchers("/load", "/admin").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("USER")
                .antMatchers("/student").authenticated()
                //.antMatchers("/").permitAll()
                .and().formLogin()
                .defaultSuccessUrl("/load")
                .and()
                .exceptionHandling().accessDeniedPage("/load/error");

    }
}
