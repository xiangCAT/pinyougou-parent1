package com.pinyougou.hf.manager.controller;

import com.pinyougou.hf.api.brand.BrandControllerApi;
import com.pinyougou.hf.framework.model.TbBrand;
import com.pinyougou.hf.framework.model.request.BrandRequest;
import com.pinyougou.hf.framework.model.response.QueryResponseList;
import com.pinyougou.hf.framework.model.response.QueryResponseResult;
import com.pinyougou.hf.manager.service.BrandServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author NQ
 * @create 2019-04-17 10:43
 */
@RestController
@RequestMapping("brand")
//@CrossOrigin(origins="http://www.pinyougou.com",allowCredentials="true")
public class BrandController implements BrandControllerApi {

    @Autowired
    BrandServcie brandServcie;


    @Override
    @GetMapping("findAll")  // 默认支持所有请求
    public QueryResponseList<TbBrand> findAll() {
        return brandServcie.findAll();
    }

    @Override
    @GetMapping("findPage/{page}/{size}")
    public QueryResponseResult<TbBrand> findPage(
            @PathVariable("page") Integer page,
            @PathVariable("size") Integer size,
            BrandRequest brandRequest) {

        return brandServcie.findPage(page, size, brandRequest);
    }


//    @GetMapping("findAll")
//    public List<TbBrand> findAll() {
//        List<TbBrand> list = new ArrayList<>();
//
//        list.add(new TbBrand().setId(1L).setFirstChar("L").setName("联想"));
//        list.add(new TbBrand().setId(2L).setFirstChar("H").setName("华为"));
//        list.add(new TbBrand().setId(3L).setFirstChar("X").setName("小米"));
//
//        return list;
//
//    }

}
