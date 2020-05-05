package com.neusoft.spring_boot.t_user.service;/**
 * $
 *
 * @author wjw
 * $
 * $
 * @date $
 */

import com.neusoft.spring_boot.t_user.dao.UserDao;
import com.neusoft.spring_boot.t_user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @Author: wwb
 * @Date: 2020/5/4 08:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map){
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer uid) {
        userDao.delById(uid);
    }

    @Override
    public void add(UserEntity userEntity) {

        userEntity.setCreatetime(new Date());
        userEntity.setSex("男");
        userDao.add(userEntity);
    }
}