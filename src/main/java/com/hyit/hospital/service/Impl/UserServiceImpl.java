package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.UserMapper;
import com.hyit.hospital.model.LoginUser;
import com.hyit.hospital.model.User;
import com.hyit.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo pageInfo = new PageInfo(userMapper.selAll(user));
        return pageInfo;
    }

    @Override
    public Map<String,Object> userAdd(User user) {
        Map<String,Object> map = new HashMap<>();
        //新增用户  防止用户名重复
        User user1 = userMapper.login(user.getUsername());
        if(user1 != null){
            //重复用户名
            map.put("status",0);
            return map;
        }else {
            user.setDelmark(1);
            userMapper.insert(user);
            //添加用户成功
            map.put("status",1);
            return map;
        }
    }

    @Override
    public void delById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void userUpdate(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public Map<String,Object> login(LoginUser loginUser) {
        Map<String,Object> map = new HashMap<>();
        User user = userMapper.login(loginUser.getUsername());
        Integer status;
        if (user != null){
            if(user.getPassword().equals(loginUser.getPassword())){
                status = 0;
                //登录成功
                map.put("user",user);
                map.put("status",status);
                return map;
            }else {
                status = 2;
                //密码错误
                map.put("status",status);
                return map;
            }
        }else {
            status = 1;
            map.put("status",status);
            //用户名错误
            return map;
        }
    }
}
