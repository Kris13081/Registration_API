package selfproject.registeration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import selfproject.registeration.models.dto.UserDto;
import selfproject.registeration.models.entity.User;
import selfproject.registeration.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }
}