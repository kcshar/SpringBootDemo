package com.kc.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName (value = "kc_test_user")
public class UserPojo {
    @TableId (value = "user_name", type = IdType.NONE)
    private String username;

    @TableField(value = "psword")
    private String password;
}
