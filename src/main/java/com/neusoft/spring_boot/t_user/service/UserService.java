package com.neusoft.spring_boot.t_user.service;/**
 * $
 *
 * @author wjw
 * $
 * $
 * @date $
 */

import com.neusoft.spring_boot.t_user.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author: wwb
 * @Date: 2020/5/4 08:38
 */
public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer uid);

    //新增用户
    public void add(UserEntity userEntity);
}
