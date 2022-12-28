package io.jay.eCommerceProject.service;

import io.jay.eCommerceProject.dto.UserDto;
import io.jay.eCommerceProject.exception.NotFound;
import io.jay.eCommerceProject.model.User;
import io.jay.eCommerceProject.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDto getUserById(Long id) throws NotFound {
        Optional<User> user = userRepository.findById(id);

        ModelMapper modelMapper = new ModelMapper();

        if (user.isPresent()) {
            return modelMapper.map(user.get(), UserDto.class);
        } else {
            throw new NotFound("The user with the id " + id + "does not exist.");
        }
    }
}
