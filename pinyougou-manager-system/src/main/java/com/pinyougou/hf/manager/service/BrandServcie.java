package com.pinyougou.hf.manager.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.hf.framework.exception.ExceptionCast;
import com.pinyougou.hf.framework.model.TbBrand;
import com.pinyougou.hf.framework.model.request.BrandRequest;
import com.pinyougou.hf.framework.model.response.CommonCode;
import com.pinyougou.hf.framework.model.response.QueryResponseList;
import com.pinyougou.hf.framework.model.response.QueryResponseResult;
import com.pinyougou.hf.framework.model.response.QueryResult;
import com.pinyougou.hf.manager.dao.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author NQ
 * @create 2019-04-17 11:24
 */
@Service
public class BrandServcie {

    @Autowired
    BrandMapper brandMapper;

    public QueryResponseList<TbBrand> findAll() {
        List<TbBrand> list = brandMapper.findAll();
        return new QueryResponseList<TbBrand>(list);
    }

    public QueryResponseResult<TbBrand> findPage(Integer page, Integer size, BrandRequest brandRequest) {

        // 参数校验
        if (page == null || page <= 0) {
//            page = 1;
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }

        if (size == null || size <= 0) {
//            page = 1;
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        // 业务处理 page从 1 开始
        PageHelper.startPage(page, size);
        Page<TbBrand> pageResult = (Page<TbBrand>) brandMapper.findPage(brandRequest);

//        List<TbBrand> list = brandMapper.findPage(brandRequest);
//        PageInfo<TbBrand> pageInfo = new PageInfo<>(list);
        // 返回结果
        QueryResult<TbBrand> queryResult = new QueryResult<>(pageResult.getResult(), pageResult.getTotal());

        QueryResponseResult<TbBrand> queryResponseResult =
                new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);

        return queryResponseResult;
    }
}
