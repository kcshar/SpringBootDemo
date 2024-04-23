package com.kc;

import com.kc.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KcSpringbootDemoApplicationTests {
    @Autowired
    Hello hello;

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
//        userService.addUser("kc","123456");
//        userService.addUser("kb","123456");
//        userService.addUser("ka","123456");
//        userService.deleteUser("k");
//        userService.selectUser("k");
        userService.updateUserByUserName("kc", "av7d");
    }

}
