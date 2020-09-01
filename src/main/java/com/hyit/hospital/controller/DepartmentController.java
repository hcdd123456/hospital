package com.hyit.hospital.controller;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Department;
import com.hyit.hospital.service.DepartmentService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hc
 * @create 2020/9/1 0001 10:59
 */
@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //用户管理外键查询所有
    @RequestMapping("selAll")
    public ResultVO selAll(){
        ResultVO resultVO = new ResultVO("",200,departmentService.selAll());
        return resultVO;
    }

    //查询列表
    @RequestMapping("selectAll/{currPage}")
    public PageInfo<Department> selectAll(@PathVariable Integer currPage, @RequestBody Department department){
        return departmentService.selectAll(currPage,department);
    }

    @RequestMapping("departmentAdd")
    public ResultVO add(@RequestBody Department department){
        departmentService.departmentAdd(department);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

    @RequestMapping("delById/{id}")
    public ResultVO delById(@PathVariable Integer id){
        departmentService.delById(id);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody Department department){
        departmentService.update(department);
        ResultVO resultVO = new ResultVO("",200);
        return resultVO;
    }

    @RequestMapping("selById/{id}")
    public ResultVO selById(@PathVariable Integer id){
        ResultVO resultVO = new ResultVO("",200,departmentService.selById(id));
        return resultVO;
    }

}
