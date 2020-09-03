package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.LoginUser;
import com.hyit.hospital.model.User;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;
import java.util.Map;

/**
 * @author hc
 * @create 2020/8/31 0031 10:25
 */
public interface UserService {

    PageInfo<User> selAll(Integer currPage,User user);

    Map<String,Object> userAdd(User user);

    void delById(Integer id);

    User selById(Integer id);

    void userUpdate(User user);

    Map<String,Object> login(LoginUser loginUser);
}
