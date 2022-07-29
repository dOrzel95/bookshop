package pl.damian.bookshop.main;

import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import java.util.Arrays;

@Configuration
public class SpringSecurityConfig{
    @Bean
    public PasswordEncoder getBcryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public InMemoryUserDetailsManager get(){
        UserDetails user = User.withUsername("Jan")
                .password("pass")
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("Admin123")
                .password("Admin312")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(Arrays.asList(user,admin));

    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/for-user").hasAnyRole("USER", "ADMIN")
                .antMatchers("/for-admin").hasAuthority("ROLE_ADMIN");
        return http.build();
    }

}
