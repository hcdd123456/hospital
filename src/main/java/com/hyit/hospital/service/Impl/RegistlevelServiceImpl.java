package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.RegistlevelMapper;
import com.hyit.hospital.mapper.UserMapper;
import com.hyit.hospital.model.Registlevel;
import com.hyit.hospital.model.User;
import com.hyit.hospital.service.RegistlevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hc
 * @create 2020/9/1 0001 11:09
 */
@Service
public class RegistlevelServiceImpl implements RegistlevelService {

    @Autowired
    private RegistlevelMapper registlevelMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Registlevel> selAll() {
        return registlevelMapper.selectAll();
    }
    @Override
    public PageInfo<Registlevel> selectAll(Integer currPage, Registlevel registlevel) {
        if (currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo pageInfo = new PageInfo(registlevelMapper.selectAll(registlevel));
        return pageInfo;
    }

    @Override
    public void registlevelAdd(Registlevel registlevel) {
        registlevel.setDelmark(1);
        registlevelMapper.insert(registlevel);
    }

    //删除前判断是否科室绑定用户
    @Override
    public Map<String,Object> delById(Integer id) {

        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setRegistleid(id);
        List<User> users = userMapper.selAll(user);
        if(users.isEmpty()){
            //成功
            map.put("status",1);
            registlevelMapper.deleteByPrimaryKey(id);
            return map;

        }else {
            //不成功
            map.put("status",0);
            return map;
        }
    }

    @Override
    public void update(Registlevel registlevel) {
        registlevelMapper.updateByPrimaryKey(registlevel);
    }

    @Override
    public Registlevel selById(Integer id) {
        return registlevelMapper.selectByPrimaryKey(id);
    }
}
