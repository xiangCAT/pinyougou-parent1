package com.pinyougou.hf.framework.modelgroup;

import com.pinyougou.hf.framework.model.TbSpecification;
import com.pinyougou.hf.framework.model.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;


/**
 * 规格选项 接收参数
 * @author nianqiang
 */
public class Specification implements Serializable{

	private TbSpecification specification;
	private List<TbSpecificationOption> specificationOptionList;
	
	public TbSpecification getSpecification() {
		return specification;
	}
	public void setSpecification(TbSpecification specification) {
		this.specification = specification;
	}
	public List<TbSpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
	}
	public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
	}
}
