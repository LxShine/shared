package com.isoftstone.shared.core.model;

import java.io.Serializable;

public class MemberLv implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer lv_id;
    private String name;
    private Integer default_lv;
    private Double discount;
    private Double lvPrice;
    private int point;
    private boolean selected;
    
	public MemberLv() {
		
	}
	
	public MemberLv(Integer lv_id, String name) {
		super();
		this.lv_id = lv_id;
		this.name = name;
	}

	public Integer getLv_id() {
		return lv_id;
	}
	public void setLv_id(Integer lv_id) {
		this.lv_id = lv_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDefault_lv() {
		return default_lv;
	}
	public void setDefault_lv(Integer default_lv) {
		this.default_lv = default_lv;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getLvPrice() {
		return lvPrice;
	}
	public void setLvPrice(Double lvPrice) {
		this.lvPrice = lvPrice;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
