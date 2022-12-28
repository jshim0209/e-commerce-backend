package io.jay.eCommerceProject.controller;

import io.jay.eCommerceProject.dto.UserDto;
import io.jay.eCommerceProject.exception.NotFound;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.model.UserRole;
import io.jay.eCommerceProject.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    UserRole fakeUserRole1 = new UserRole();
    UserRole fakeUserRole2 = new UserRole();
    User fakeUser1 = new User();
    User fakeUser2 = new User();
    ModelMapper modelMapper = new ModelMapper();

    @BeforeEach
    public void setup() {
        fakeUserRole1.setId(1);
        fakeUserRole1.setRole("ROLE_BUYER");

        fakeUserRole2.setId(2);
        fakeUserRole2.setRole("ROLE_SELLER");

        fakeUser1.setId(1L);
        fakeUser1.setFirstName("firstName1");
        fakeUser1.setLastName("lastName1");
        fakeUser1.setPassword("password1");
        fakeUser1.setEmail("email1");
        fakeUser1.setUserRole(fakeUserRole1);
        fakeUser1.setActive(true);

        fakeUser2.setId(2L);
        fakeUser2.setFirstName("firstName2");
        fakeUser2.setLastName("lastName2");
        fakeUser2.setPassword("password2");
        fakeUser2.setEmail("email2");
        fakeUser2.setUserRole(fakeUserRole2);
        fakeUser2.setActive(true);

    }

    @Test
    void positiveTest_getAllUsers() {
        List<User> users =new ArrayList<>();
        users.add(fakeUser1);
        users.add(fakeUser2);

        when(userService.getAllUsers()).thenReturn(users);

        int actualStatus = userController.getAllUsers().getStatusCode().value();
        int expectedStatus = 200;

        Assertions.assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void positiveTest_getUserById() throws NotFound {
        UserDto user1 = modelMapper.map(Optional.of(fakeUser1).get(), UserDto.class);

        when(userService.getUserById(1L)).thenReturn(user1);

        int actualStatus = userController.getUserById("1").getStatusCode().value();
        int expectedStatus = 200;

        Assertions.assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void negativeTest_getUserById() throws NotFound {

        when(userService.getUserById(3L)).thenThrow(NotFound.class);

        Assertions.assertThrows(NotFound.class,
                () -> userController.getUserById("3")
        );
    }
}
