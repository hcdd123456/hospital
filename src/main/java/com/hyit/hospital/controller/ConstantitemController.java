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

    @RequestMapping("selAll")
    public ResultVO selAll(){
        ResultVO resultVO = new ResultVO("成功",200,constantitemService.selAll());
        return resultVO;
    }

}
