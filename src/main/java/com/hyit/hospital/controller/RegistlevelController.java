package com.hyit.hospital.controller;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Registlevel;
import com.hyit.hospital.service.RegistlevelService;
import com.hyit.hospital.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("selectAll/{currPage}")
    public PageInfo<Registlevel> selectAll(@PathVariable Integer currPage, @RequestBody Registlevel registlevel){
        return registlevelService.selectAll(currPage,registlevel);
    }
    @RequestMapping("registlevelAdd")
    public ResultVO add(@RequestBody Registlevel registlevel){
        registlevelService.registlevelAdd(registlevel);
        ResultVO resultVO=new ResultVO("",200);
        return resultVO;
    }
    @RequestMapping("delById/{id}")
    public ResultVO deById(@PathVariable Integer id){
        registlevelService.delById(id);
        ResultVO resultVO=new ResultVO("",200);
        return resultVO;
    }
    @RequestMapping("update")
    public ResultVO update(@RequestBody Registlevel registlevel){
        registlevelService.update(registlevel);
        ResultVO resultVO=new ResultVO("",200);
        return resultVO;
    }
    @RequestMapping("selById/{id}")
    public ResultVO selById(@PathVariable Integer id){
        ResultVO resultVO=new ResultVO("",200,registlevelService.selById(id));
        return resultVO;
    }

}
