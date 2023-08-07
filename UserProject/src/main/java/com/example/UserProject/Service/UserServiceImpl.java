package com.example.UserProject.Service;

import com.example.UserProject.Model.User;
import com.example.UserProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user, int user_id) {
        Optional<User> optUser = userRepository.findById(user_id);
        if (optUser.isEmpty()) {
            return null;
        }
        User existingUser = optUser.get();
        if (user.getFirstname() != null) {
            existingUser.setFirstname(user.getFirstname());
        }
        if (user.getLastName() != null) {
            existingUser.setLastName(user.getLastName());
        }
        if (user.getPassWord() != null) {
            existingUser.setPassWord(user.getPassWord());
        }
        return userRepository.save(existingUser);
    }

    @Override
    public String deleteUserByUserId(int userId) {

        if (userRepository.findById(userId).isEmpty()) {
            return ("User not found ");
        }
//
        else {
            userRepository.deleteById(userId);
            return "User deleted successfully";
        }
        }


        @Override
        public List<User> getUserByLastName (String lastName){
            return userRepository.findByLastName(lastName);
        }
    }
