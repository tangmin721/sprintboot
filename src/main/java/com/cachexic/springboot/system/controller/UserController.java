package com.cachexic.springboot.system.controller;

import com.cachexic.springboot.system.dao.UserDao;
import com.cachexic.springboot.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tangmin
 * @version V1.0
 * @Title: UserController.java
 * @Package com.cachexic.springboot.demo.controller
 * @Description: use
 * @date 2017-04-04 11:16:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("users")
    public List<User> getUser(){
        return userDao.findAll();
    }

    @PostMapping(value = "saveUser")
    public User saveUser(User user){
        User save = userDao.save(user);
        return save;
    }

    @PutMapping("updataUser")
    public User updateUser(User user){
        return userDao.save(user);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userDao.delete(id);
    }

}
