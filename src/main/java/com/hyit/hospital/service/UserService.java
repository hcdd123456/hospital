package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.User;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @author hc
 * @create 2020/8/31 0031 10:25
 */
public interface UserService {

    PageInfo<User> selAll(Integer currPage,User user);

    void userAdd(User user);

    void delById(Integer id);

    User selById(Integer id);

    void userUpdate(User user);
}
