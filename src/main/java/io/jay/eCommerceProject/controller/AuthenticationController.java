package io.jay.eCommerceProject.controller;

import io.jay.eCommerceProject.dto.AuthenticationRequest;
import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.service.CustomUserDetailsService;
import io.jay.eCommerceProject.utility.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request) {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Incorrect username or password", e);
        }

        final CustomUserDetails userDetails = userDetailsService
                .loadUserByUsername(request.getEmail());

        if (userDetails != null) {
            return ResponseEntity.ok(JwtUtils.generateToken(userDetails));
        }
        return ResponseEntity.status(400).body("Some error has occured.");
    }
}