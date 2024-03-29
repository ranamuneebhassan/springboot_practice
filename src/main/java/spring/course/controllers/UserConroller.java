package spring.course.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;
import spring.course.services.TimeService;
import spring.course.services.TimeServiceImp;
import spring.course.services.UserService;
import spring.course.services.UserServiceImp;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserConroller {

  //  private Map<String,UserModel> userMap=new HashMap<>();
    private UserServiceImp service;
    private final TimeServiceImp timeService;

    public UserConroller()
    {
        service=new UserServiceImp();
        timeService=new TimeServiceImp();
    }

    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getuser(@PathVariable("userName") String userName)
    {
            return ResponseEntity.of(Optional.of(service.getUser(userName)));

    }

    @PostMapping ("/addUser")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserModel user1)
    {
        user1.setCrteationTime(timeService.getCurrentTime("Berlin"));
        System.out.println(timeService.getCurrentTime("Berlin"));
        service.addUser(user1);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping ("/deleteUser/{userName}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("userName") String userName)
    {
        service.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }
}
