package com.project.demo;



@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController{
    private UserService userService;

    //build create user api
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser=userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //build get user by id rest api
    //http://localhost:8080/api/Users/1
    @GettMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user=userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //build get all users rest api
    //http://localhost:8080/api/Users/1
    @GettMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users=userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //build update users rest api
    //http://localhost:8080/api/Users/1
    @PutMapping
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user){
        user.setId(userId);
        User updateUser=userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    //build delete user rest api
    //http://localhost:8080/api/Users/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted", HttpStatus.OK);
    }


}