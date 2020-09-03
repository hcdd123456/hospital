package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.DepartmentMapper;
import com.hyit.hospital.mapper.UserMapper;
import com.hyit.hospital.model.Department;
import com.hyit.hospital.model.User;
import com.hyit.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hc
 * @create 2020/9/1 0001 11:00
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Department> selAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public PageInfo<Department> selectAll(Integer currPage, Department department) {
        if (currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo pageInfo = new PageInfo(departmentMapper.selAll(department));
        return pageInfo;
    }

    @Override
    public void departmentAdd(Department department) {
        departmentMapper.insert(department);
    }

    //删除前判断是否科室绑定用户
    @Override
    public Map<String, Object> delById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setDeptid(id);
        List<User> users = userMapper.selAll(user);
        if(users.isEmpty()){
            //成功
            map.put("status",1);
            departmentMapper.deleteByPrimaryKey(id);
            return map;

        }else {
            //不成功
            map.put("status",0);
            return map;
        }
    }

    @Override
    public void update(Department department) {
        departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public Department selById(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }


}
