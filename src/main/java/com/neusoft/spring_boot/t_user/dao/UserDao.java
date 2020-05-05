package com.neusoft.spring_boot.t_user.dao;/**
 * $
 *
 * @author wjw
 * $
 * $
 * @date $
 */

import com.neusoft.spring_boot.t_user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author: wwb
 * @Date: 2020/5/4 08:40
 */
@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer uid);

    public void add(UserEntity userEntity);
}
