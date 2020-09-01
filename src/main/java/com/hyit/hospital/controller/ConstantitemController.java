package com.hyit.hospital.controller;

import com.hyit.hospital.model.Constantitem;
import com.hyit.hospital.service.ConstantitemService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hc
 * @create 2020/8/31 0031 23:26
 */
@RestController
@RequestMapping("/constantitem")
public class ConstantitemController {

    @Autowired
    private ConstantitemService constantitemService;

    //用户表
    @RequestMapping("selByUserDocTitleID")
    public ResultVO selByUserDocTitleID(){
        ResultVO resultVO = new ResultVO("成功",200,constantitemService.selByUserDocTitleID());
        return resultVO;
    }

    //科室表
    @RequestMapping("selByDepartmentDeptcategoryid")
    public ResultVO selByDepartmentDeptcategoryid(){
        ResultVO resultVO = new ResultVO("成功",200,constantitemService.selByDeptcategoryid());
        return resultVO;
    }

}
