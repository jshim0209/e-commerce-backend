package io.jay.eCommerceProject.controller;

import io.jay.eCommerceProject.dto.UserDto;
import io.jay.eCommerceProject.exception.NotFound;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUsers());
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("user_id") String userId) throws NotFound {
        Long id = Long.parseLong(userId);
        return ResponseEntity.ok().body(userService.getUserById(id));
    }
}
