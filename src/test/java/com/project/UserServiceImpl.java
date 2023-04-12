package com.project.demo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
    @Override
    public User getUserById(Long userId){
        Optional<User> optionalUser=user.findById(userId);
        return userRepository.get();
    }
    @Override
    public User updateUser(User user){
        User extinguishUser=userRepository.findById(user.getId()).get();
        extinguishUser.setfirstName(user.getfirstName());
        extinguishUser.setlastName(user.getlastName());
        extinguishUser.setemail(user.getemail());
        User updateUser=userRepository.save(extinguishUser);
        return updateUser;
    }
    @Override
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}