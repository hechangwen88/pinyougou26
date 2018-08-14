package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wenhechang ^_^
 * @version 1.0
 * @create 2018-08-14 11:19
 * @package com.pinyougou.sellergoods.service.impl
 */
@Service(timeout = 100000)
public class BrandServiceImpl implements BrandService{
    @Autowired
    private TbBrandMapper brandMapper;
    @Override
    public List<TbBrand> findAll() {




        return brandMapper.selectByExample(null);
    }
}
