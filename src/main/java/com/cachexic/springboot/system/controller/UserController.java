package com.cachexic.springboot.system.controller;

import com.cachexic.springboot.common.exceptions.valid.ValidErrorUtils;
import com.cachexic.springboot.common.result.Result;
import com.cachexic.springboot.common.result.ResultUtil;
import com.cachexic.springboot.system.dao.UserDao;
import com.cachexic.springboot.system.entity.User;
import com.cachexic.springboot.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public Result getUser(){
        logger.info("UserController:get user method print");
        return ResultUtil.SUCCESS(userDao.findAll());
    }

    @PostMapping(value = "saveUser")
    public Result saveUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.FAIL(ValidErrorUtils.changgeValidError(bindingResult));
        }
        return ResultUtil.SUCCESS(userDao.save(user));
    }

    @PutMapping("updataUser")
    public Result updateUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.FAIL(ValidErrorUtils.changgeValidError(bindingResult));
        }
        return ResultUtil.SUCCESS(userDao.save(user));
    }

    @DeleteMapping("delete/{id}")
    public Result deleteUser(@PathVariable Long id){
        userDao.delete(id);
        return ResultUtil.SUCCESS();
    }

    @GetMapping("forAgeReturnSomeMsg/{id}")
    public Result forAgeReturnSomeMsg(@PathVariable Long id) throws Exception {
        userService.forAgeReturnSomeMsg(id);
        return  ResultUtil.SUCCESS();
    }

}
