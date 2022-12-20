package io.jay.eCommerceProject.controller;

import io.jay.eCommerceProject.dto.AuthenticationRequest;
import io.jay.eCommerceProject.model.CustomUserDetails;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.model.UserRole;
import io.jay.eCommerceProject.service.CustomUserDetailsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AuthenticationControllerTest {

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private CustomUserDetailsService userDetailsService;

    @InjectMocks
    private AuthenticationController authenticationController;

    @Test
    void positiveTest_createAuthenticationToken() throws Exception {

        UserRole role =
                new UserRole(1, "ROLE_BUYER");
        User user =
                new User(1L,
                "password",
                "jshim0209@hotmail.com",
                "Jay",
                "Shim",
                role, true);

        AuthenticationRequest authenticationRequest =
                new AuthenticationRequest(user.getEmail(),
                        user.getPassword());

        CustomUserDetails userDetails = new CustomUserDetails(user);

        when(userDetailsService.loadUserByUsername(user.getEmail())).thenReturn(userDetails);

        int actualStatus =  authenticationController.authenticate(authenticationRequest).getStatusCode().value();
        int expectedStatus = 200;

        Assertions.assertEquals(expectedStatus, actualStatus);
    }
}
