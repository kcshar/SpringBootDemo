package com.kc.controller;

import com.kc.service.UserServiceImpl;
import com.kc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kc
 * @date 2024/4/23 17:15
 */

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        userService.addUser(username, password);
        return Result.okGetString();
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam("username") String username){
        userService.deleteUser(username);
        return Result.okGetDelString("删除成功");
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public String updateUser(@RequestParam("username") String username,
                             @RequestParam("password") String password){
        userService.updateUserByUserName(username,password);
        return Result.okGetDelString("更新成功");
    }

    @RequestMapping(value = "/findUser/{username}",method = RequestMethod.GET)
    public String findUser(@PathVariable ("username") String username){
        Object o = userService.selectUserList(username);
        return Result.okGetStringByData("查询成功",o);
    }
}
