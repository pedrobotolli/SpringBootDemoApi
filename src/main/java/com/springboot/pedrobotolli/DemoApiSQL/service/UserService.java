package com.springboot.pedrobotolli.DemoApiSQL.service;

import com.springboot.pedrobotolli.DemoApiSQL.dto.UserDTO;
import com.springboot.pedrobotolli.DemoApiSQL.model.User;
import com.springboot.pedrobotolli.DemoApiSQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public UserDTO getUserById(UUID id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id = " + id + " not found"));
        return convertToDTO(user);
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return convertToDTO(userRepository.save(user));
    }

    public UserDTO updateUser(UUID id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id = " + id + " not found"));
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        return convertToDTO(userRepository.save(user));
    }

    public void deleteUser(UUID id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id = " + id + " not found"));
        userRepository.delete(user);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
}
