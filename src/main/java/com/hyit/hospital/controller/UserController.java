package com.hyit.hospital.controller;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.User;
import com.hyit.hospital.service.UserService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hc
 * @create 2020/8/31 0031 10:26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有
    @RequestMapping("selAll/{currPage}")
    public PageInfo<User> selAll(@PathVariable Integer currPage, @RequestBody User user){
        return userService.selAll(currPage,user);
    }

    //用户新增
    @RequestMapping("userAdd")
    public ResultVO userAdd(@RequestBody User user){
        userService.userAdd(user);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

    //用户删除
    @RequestMapping("delById/{id}")
    public ResultVO userDel(@PathVariable Integer id){
        userService.delById(id);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

    //根据主键加载
    @RequestMapping("selById/{id}")
    public ResultVO selById(@PathVariable Integer id){
        ResultVO resultVO = new ResultVO("",200,userService.selById(id));
        return resultVO;
    }

    //更新
    @RequestMapping("userUpdate")
    public ResultVO userUpdate(@RequestBody User user){
        userService.userUpdate(user);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

}
