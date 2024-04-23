package com.kc.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kc.dao.UserDao;
import com.kc.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kc
 * @date 2024/4/22 9:51
 */
@Service
public class UserServiceImpl{

    @Autowired
    UserDao userDao;

    public void addUser(String username, String password){
        userDao.insert(new UserPojo(username, password));
    }

    public void deleteUserByName(String username){
        userDao.deleteById(username);
    }

    public void deleteUser(String username){
        userDao.delete(new QueryWrapper<UserPojo>().like("user_name",username));
    }

    public void selectUserByName(String username){
        UserPojo pj = userDao.selectOne(new QueryWrapper<UserPojo>().eq("user_name", username));
        System.out.println(pj);
    }

    public void selectUser(String username){
        List<UserPojo> pj = userDao.selectList(new QueryWrapper<UserPojo>().like("user_name", username));
        pj.forEach(item ->{
            System.out.println(item);
        });
    }

    public Object selectUserList(String username){
        List<UserPojo> pj = userDao.selectList(new QueryWrapper<UserPojo>().like("user_name", username));
        pj.forEach(item ->{
            System.out.println(item);
        });
        return pj;
    }

    public void updateUserByUserName(String username, String password){
        UserPojo pj = userDao.selectById(username);
        pj.setPassword(password);
        userDao.update(pj,new QueryWrapper<UserPojo>().eq("user_name", username));
    }

}
