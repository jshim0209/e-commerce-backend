package io.jay.eCommerceProject.service;

import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.model.UserRole;
import io.jay.eCommerceProject.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomUserDetailsServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private CustomUserDetailsService userDetailsService;

    @Test
    void positiveTest_loadUserByEmail() {
        UserRole userRole = new UserRole();
        userRole.setId(1);
        userRole.setRole("ROLE_BUYER");

        User user = new User();
        user.setEmail("jshim0209@hotmail.com");
        user.setPassword("password");
        user.setUserRole(userRole);
        user.setActive(true);

        when(userRepository.findByEmail("jshim0209@hotmail.com")).thenReturn(Optional.of(user));

        UserDetails expected = new CustomUserDetails(user);
        UserDetails actual = userDetailsService.loadUserByUsername("jshim0209@hotmail.com");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void negativeTest_loadUserByEmail() {
        when(userRepository.findByEmail("")).thenReturn(Optional.empty());

        Assertions.assertThrows(
                UsernameNotFoundException.class, () -> userDetailsService.loadUserByUsername("")
        );
    }
}
