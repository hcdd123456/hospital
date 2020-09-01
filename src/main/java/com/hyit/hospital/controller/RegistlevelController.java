package com.hyit.hospital.controller;

import com.hyit.hospital.service.RegistlevelService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hc
 * @create 2020/9/1 0001 11:10
 */
@RequestMapping("/registlevel")
@RestController
public class RegistlevelController {

    @Autowired
    private RegistlevelService registlevelService;

    @RequestMapping("selAll")
    public ResultVO selAll(){
        ResultVO resultVO = new ResultVO("",200,registlevelService.selAll());
        return resultVO;
    }

}
