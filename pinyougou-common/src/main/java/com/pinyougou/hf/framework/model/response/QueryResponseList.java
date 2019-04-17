package com.pinyougou.hf.framework.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class QueryResponseList<T> extends ResponseResult {

    private List<T> resultList;

    public QueryResponseList(List<T> resultList){
        this.resultList = resultList;
    }

}
