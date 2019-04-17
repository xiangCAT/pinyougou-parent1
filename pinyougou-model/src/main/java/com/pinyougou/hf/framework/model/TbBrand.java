package com.pinyougou.hf.framework.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class TbBrand implements Serializable {
    private Long id;

    private String name;

    private String firstChar;

}