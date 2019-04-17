package com.pinyougou.hf.manager.dao;

import com.pinyougou.hf.framework.model.TbBrand;
import com.pinyougou.hf.framework.model.request.BrandRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author NQ
 * @create 2019-04-17 11:04
 */
@Mapper
public interface BrandMapper {


    /**
     * 查询所有
     * @return
     */
    List<TbBrand> findAll();


    /**
     * 根据条件查询带分页
     * @param brandRequest 查询条件
     * @return
     */
    List<TbBrand> findPage(BrandRequest brandRequest);

}
