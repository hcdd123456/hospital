package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.UserMapper;
import com.hyit.hospital.model.User;
import com.hyit.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hc
 * @create 2020/8/31 0031 10:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> selAll(Integer currPage,User user) {
        if (currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage,Common.PAGE_SIZE);
        PageInfo pageInfo = new PageInfo(userMapper.selAll(user));
        return pageInfo;
    }
}
