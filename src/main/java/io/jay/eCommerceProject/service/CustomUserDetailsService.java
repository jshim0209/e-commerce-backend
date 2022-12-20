package io.jay.eCommerceProject.service;

import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);

        CustomUserDetails userDetails =
                user.map(CustomUserDetails::new).get();

        if (user.isPresent()) {

            return userDetails;
        } else {
            throw new UsernameNotFoundException("Not found: " + email);
        }
    }
}