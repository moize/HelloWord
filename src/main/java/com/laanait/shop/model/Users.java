package com.laanait.shop.model;
// default package
// Generated 20 nov. 2011 19:45:07 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userEmail;
	private String userPassword;
	private Set<Logs> logses = new HashSet<Logs>(0);
	private Set<Shops> shopses = new HashSet<Shops>(0);
	private Set<Companies> companieses = new HashSet<Companies>(0);

	public Users() {
	}

	public Users(String userEmail, String userPassword) {
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public Users(String userEmail, String userPassword, Set<Logs> logses,
			Set<Shops> shopses, Set<Companies> companieses) {
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.logses = logses;
		this.shopses = shopses;
		this.companieses = companieses;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Set<Logs> getLogses() {
		return this.logses;
	}

	public void setLogses(Set<Logs> logses) {
		this.logses = logses;
	}

	public Set<Shops> getShopses() {
		return this.shopses;
	}

	public void setShopses(Set<Shops> shopses) {
		this.shopses = shopses;
	}

	public Set<Companies> getCompanieses() {
		return this.companieses;
	}

	public void setCompanieses(Set<Companies> companieses) {
		this.companieses = companieses;
	}

}
