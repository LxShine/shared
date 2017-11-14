package com.isoftstone.shared.core.model;

import java.io.Serializable;

public class Member implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer member_id;
	
	private Integer lv_id;

	private String uname;

	private String email;

	private String password;

	private Long regtime;

	private String pw_answer;

	private String pw_question;

	private String name;

	private Integer sex;

	private Long birthday;
	
	private Double advance;

	private Integer province_id;
	
	private Integer city_id;
	
	private Integer region_id;
	
	private String province;
	
	private String city;
	
	private String region;

	private String address;

	private String zip;

	private String mobile;

	private String tel;

	private Integer point;
	
	private String qq;
	
	private String msn;
	
	private String remark;
	
	private long lastlogin;
	
	private Integer logincount;
	
	private int mp;  //消费积分 
	
	//会员等级名称，非数据库字段
	private String lvname;
	
	private int parentid; //父代理商id
	private Integer agentid; //代理商id
	
	private int is_cheked; //是否已验证
	private String registerip; // 注册IP
	
	private int is_related; //是否关联企业

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public Integer getLv_id() {
		return lv_id;
	}

	public void setLv_id(Integer lv_id) {
		this.lv_id = lv_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRegtime() {
		return regtime;
	}

	public void setRegtime(Long regtime) {
		this.regtime = regtime;
	}

	public String getPw_answer() {
		return pw_answer;
	}

	public void setPw_answer(String pw_answer) {
		this.pw_answer = pw_answer;
	}

	public String getPw_question() {
		return pw_question;
	}

	public void setPw_question(String pw_question) {
		this.pw_question = pw_question;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public Double getAdvance() {
		return advance;
	}

	public void setAdvance(Double advance) {
		this.advance = advance;
	}

	public Integer getProvince_id() {
		return province_id;
	}

	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(long lastlogin) {
		this.lastlogin = lastlogin;
	}

	public Integer getLogincount() {
		return logincount;
	}

	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getLvname() {
		return lvname;
	}

	public void setLvname(String lvname) {
		this.lvname = lvname;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public Integer getAgentid() {
		return agentid;
	}

	public void setAgentid(Integer agentid) {
		this.agentid = agentid;
	}

	public int getIs_cheked() {
		return is_cheked;
	}

	public void setIs_cheked(int is_cheked) {
		this.is_cheked = is_cheked;
	}

	public String getRegisterip() {
		return registerip;
	}

	public void setRegisterip(String registerip) {
		this.registerip = registerip;
	}

	public int getIs_related() {
		return is_related;
	}

	public void setIs_related(int is_related) {
		this.is_related = is_related;
	}
}
