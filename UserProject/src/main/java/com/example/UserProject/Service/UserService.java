package com.example.UserProject.Service;

import com.example.UserProject.Model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User>getAllUser();
    User updateUser(User user, int user_id);
    String deleteUserByUserId(int userId);

     List<User>getUserByLastName(String lastName);

}
