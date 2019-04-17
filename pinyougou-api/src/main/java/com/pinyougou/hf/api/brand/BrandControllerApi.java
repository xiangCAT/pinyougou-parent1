package com.pinyougou.hf.api.brand;

import com.pinyougou.hf.framework.model.TbBrand;
import com.pinyougou.hf.framework.model.request.BrandRequest;
import com.pinyougou.hf.framework.model.response.QueryResponseList;
import com.pinyougou.hf.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author NQ
 * @create 2019-04-17 11:15
 */
@Api(value = "品牌管理", description = "品牌管理提供品牌的CRUD操作")
public interface BrandControllerApi {

    /**
     * 查询所有
     * @return
     */
    @ApiOperation("查询所有的品牌")
    public QueryResponseList<TbBrand> findAll();


    /**
     * 根据条件分页查询
     * @param page 当前页
     * @param size 每页显示记录数
     * @param brandRequest 查询条件
     * @return
     */
    @ApiOperation("根据条件查询品牌列表带分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value = "页码",required=true,paramType="path",dataType="int"),
            @ApiImplicitParam(name="size",value = "每页记录数",required=true,paramType="path",dataType="int")
    })
    public QueryResponseResult<TbBrand> findPage(Integer page, Integer size, BrandRequest brandRequest);


}
