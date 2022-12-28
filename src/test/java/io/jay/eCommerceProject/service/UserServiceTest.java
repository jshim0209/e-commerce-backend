package io.jay.eCommerceProject.service;

import io.jay.eCommerceProject.dto.UserDto;
import io.jay.eCommerceProject.exception.NotFound;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.model.UserRole;
import io.jay.eCommerceProject.repository.UserRepository;
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
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

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
        List<User> expected = new ArrayList<>();
        expected.add(fakeUser1);
        expected.add(fakeUser2);

        when(userRepository.findAll()).thenReturn(expected);

        List<User> actual = userService.getAllUsers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void positiveTest_getUserById() throws NotFound {
        when(userRepository.findById(1L)).thenReturn(Optional.of(fakeUser1));

        UserDto expected = modelMapper.map(Optional.of(fakeUser1).get(), UserDto.class);
        UserDto actual = userService.getUserById(1L);

        Assertions.assertEquals(expected, actual);
    }
}
