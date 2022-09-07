package com.fang.rest.webservices.restfulwebservices.user;

import com.fang.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserResource {
    private final UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findOneUser(@PathVariable Integer id) throws Exception {
        User user = userDaoService.findOne(id);

        if (user == null)
            throw new UserNotFoundException("Id: " + id);

        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
