package com.hyit.hospital.controller;

import com.hyit.hospital.service.DepartmentService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("selAll")
    public ResultVO selAll(){
        ResultVO resultVO = new ResultVO("",200,departmentService.selAll());
        return resultVO;
    }

}
