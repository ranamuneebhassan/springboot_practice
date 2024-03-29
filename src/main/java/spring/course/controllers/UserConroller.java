package spring.course.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;
import spring.course.services.UserService;
import spring.course.services.UserServiceImp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserConroller {

    private Map<String,UserModel> userMap=new HashMap<>();


    public UserConroller( )
    {
        userMap.put("muneeb", new UserModel("Muneeb","Hassan",123));
        userMap.put("hassan", new UserModel("Rana","Hassan",113));
    }

    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getuser(@PathVariable("userName") String userName)
    {
            return ResponseEntity.of(Optional.of(userMap.get(userName)));

    }

    @PostMapping ("/addUser")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserModel user1)
    {
        userMap.put(user1.getFirstName(),user1);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping ("/deleteUser/{userName}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("userName") String userName)
    {
        userMap.remove(userName);
        return ResponseEntity.noContent().build();
    }
}
