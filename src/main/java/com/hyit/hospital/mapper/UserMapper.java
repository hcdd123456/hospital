package com.hyit.hospital.mapper;

import com.hyit.hospital.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> selAll(User user);

    User login(String username);
}