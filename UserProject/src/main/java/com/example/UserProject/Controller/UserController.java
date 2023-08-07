package com.example.UserProject.Controller;

import com.example.UserProject.Model.User;
import com.example.UserProject.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class UserController {

    private UserServiceImpl userService;
@Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/user" )
    ResponseEntity<?>saveuser(@RequestBody User user)
    {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
    @GetMapping("/users")
    ResponseEntity<?>getAllusers()
    {
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.FOUND);
    }

    @GetMapping("/users/{lastName}")
    public ResponseEntity<?> getAllUsersByLastName(@PathVariable String lastName) {
        return new ResponseEntity<>(userService.getUserByLastName(lastName), HttpStatus.FOUND);
    }
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable int userId){
//        System.out.println("HHHHHH");
        return new ResponseEntity<>(userService.deleteUserByUserId(userId), HttpStatus.OK);
    }
    @PutMapping("/user/{userId}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable int userId) {
        return new ResponseEntity<>(userService.updateUser(user,userId), HttpStatus.OK);
    }

}
