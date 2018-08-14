package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import java.util.List;

/**
 * @author wenhechang ^_^
 * @version 1.0
 * @create 2018-08-14 12:00
 * @package com.pinyougou.manager.controller
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        //1.引入服务
        //2.调用服务的方法
        //3.返回
        List<TbBrand> all = brandService.findAll();
        return all;
    }
}
