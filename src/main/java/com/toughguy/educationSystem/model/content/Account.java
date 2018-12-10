package com.toughguy.educationSystem.model.content;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.toughguy.educationSystem.model.AbstractModel;
import com.toughguy.educationSystem.util.JsonUtil;

/**
 * 账户实体类
 * @author ZMK
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //为空字段不返回
public class Account extends AbstractModel {
	private int  id;
	private String account;    //账号
	private String password;  // 密码
	private String weixinNum;    //微信号
	private String phoneNum;   //手机号
	private String  sex;    // 性别
	private int integral;  //积分
	private int  type;     //身份类型    （1学生  2老师）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWeixinNum() {
		return weixinNum;
	}
	public void setWeixinNum(String weixinNum) {
		this.weixinNum = weixinNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString(){
		return JsonUtil.objectToJson(this);
	}

}