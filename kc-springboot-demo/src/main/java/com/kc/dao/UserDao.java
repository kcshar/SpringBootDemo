package com.kc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kc.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author kc
 * @date 2024/4/19 16:22
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<UserPojo> {
}
