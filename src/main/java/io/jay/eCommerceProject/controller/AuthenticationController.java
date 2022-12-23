package io.jay.eCommerceProject.controller;

import io.jay.eCommerceProject.dto.AuthenticationRequest;
import io.jay.eCommerceProject.model.AuthenticationResponse;
import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.service.CustomUserDetailsService;
import io.jay.eCommerceProject.utility.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
//@CrossOrigin(origins = "${allowed.origins}", allowCredentials = "true")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) throws BadCredentialsException {

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
            final String jwt = JwtUtils.generateToken(userDetails);
            return ResponseEntity.ok(new AuthenticationResponse(jwt, userDetails.getId()));
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new AuthenticationResponse());
    }
}