package com.pinyougou.hf.framework.modelgroup;

import com.pinyougou.hf.framework.model.TbOrderItem;

import java.io.Serializable;
import java.util.List;


/**
 * 购物车实体对象
 * @author nianqiang
 */
public class Cart implements Serializable {
	
	// 商家ID
	private String sellerId;
	// 商家名
	private String sellerName;
	// 购物车明细列表
	private List<TbOrderItem> orderItemList;
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public List<TbOrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<TbOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
}
