package io.jay.eCommerceProject.service;

import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent()) {
            return user.map(CustomUserDetails::new).get();
        } else {
            throw new UsernameNotFoundException("Not found: " + email);
        }
    }
}