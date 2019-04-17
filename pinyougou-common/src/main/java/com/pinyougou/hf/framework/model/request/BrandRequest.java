package com.pinyougou.hf.framework.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 前端发送请求的参数接收的实体类
 * @author NQ
 * @create 2019-04-17 11:06
 */
@Data
public class BrandRequest extends RequestData {

    @ApiModelProperty("品牌名称")
    private String name;

    private String firstChar;
}
