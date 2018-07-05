package com.sz.model;

/**
 * @author  佚名
 * @date 2018年6月27日 14:08:32
 * 【功能】
 * 	账号模型（实体类）
 *
 */
public class Account {

	/**
	 * 账号唯一标记
	 */
	private String aid;
	/**
	 * 账号的拥有者
	 */
	private String name;
	/**
	 * 账号本身密码
	 */
	private String password;

	/**
	 * 支付密码
	 */
	private String payPassword;

	/**
	 * 余额
	 */
	private double balance;

	public String getAid() {
		return this.aid;
	}

	/**
	 * 
	 * @param aid
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPayPassword() {
		return this.payPassword;
	}

	/**
	 * 
	 * @param payPassword
	 */
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}