package com.laanait.shop.model;

// Generated 20 nov. 2011 22:24:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Shops generated by hbm2java
 */
public class Shops implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer shopId;
	private String shopName;
	private String shopDescription;
	private String shopAddress;
	private String shopZip;
	private String shopCity;
	private String shopCountry;
	private String shopLat;
	private String shopLon;
	private String shopPhone;
	private String shopFax;
	private String shopEmail;
	private String shopWebsite;
	private Date shopJoinDate;
	private int shopStatus;
	private Set<?> logses = new HashSet<Object>(0);
	private Set<?> userses = new HashSet<Object>(0);
	private Set<?> shopsCategorieses = new HashSet<Object>(0);
	private Set<?> adsShopses = new HashSet<Object>(0);

	public Shops() {
	}

	public Shops(Date shopJoinDate, int shopStatus) {
		this.shopJoinDate = shopJoinDate;
		this.shopStatus = shopStatus;
	}

	public Shops(String shopName, String shopDescription, String shopAddress,
			String shopZip, String shopCity, String shopCountry,
			String shopLat, String shopLon, String shopPhone, String shopFax,
			String shopEmail, String shopWebsite, Date shopJoinDate,
			int shopStatus, Set<?> logses, Set<?> userses, Set<?> shopsCategorieses,
			Set<?> adsShopses) {
		this.shopName = shopName;
		this.shopDescription = shopDescription;
		this.shopAddress = shopAddress;
		this.shopZip = shopZip;
		this.shopCity = shopCity;
		this.shopCountry = shopCountry;
		this.shopLat = shopLat;
		this.shopLon = shopLon;
		this.shopPhone = shopPhone;
		this.shopFax = shopFax;
		this.shopEmail = shopEmail;
		this.shopWebsite = shopWebsite;
		this.shopJoinDate = shopJoinDate;
		this.shopStatus = shopStatus;
		this.logses = logses;
		this.userses = userses;
		this.shopsCategorieses = shopsCategorieses;
		this.adsShopses = adsShopses;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDescription() {
		return this.shopDescription;
	}

	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopZip() {
		return this.shopZip;
	}

	public void setShopZip(String shopZip) {
		this.shopZip = shopZip;
	}

	public String getShopCity() {
		return this.shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopCountry() {
		return this.shopCountry;
	}

	public void setShopCountry(String shopCountry) {
		this.shopCountry = shopCountry;
	}

	public String getShopLat() {
		return this.shopLat;
	}

	public void setShopLat(String shopLat) {
		this.shopLat = shopLat;
	}

	public String getShopLon() {
		return this.shopLon;
	}

	public void setShopLon(String shopLon) {
		this.shopLon = shopLon;
	}

	public String getShopPhone() {
		return this.shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getShopFax() {
		return this.shopFax;
	}

	public void setShopFax(String shopFax) {
		this.shopFax = shopFax;
	}

	public String getShopEmail() {
		return this.shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public String getShopWebsite() {
		return this.shopWebsite;
	}

	public void setShopWebsite(String shopWebsite) {
		this.shopWebsite = shopWebsite;
	}

	public Date getShopJoinDate() {
		return this.shopJoinDate;
	}

	public void setShopJoinDate(Date shopJoinDate) {
		this.shopJoinDate = shopJoinDate;
	}

	public int getShopStatus() {
		return this.shopStatus;
	}

	public void setShopStatus(int shopStatus) {
		this.shopStatus = shopStatus;
	}

	public Set<?> getLogses() {
		return this.logses;
	}

	public void setLogses(Set<?> logses) {
		this.logses = logses;
	}

	public Set<?> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<?> userses) {
		this.userses = userses;
	}

	public Set<?> getShopsCategorieses() {
		return this.shopsCategorieses;
	}

	public void setShopsCategorieses(Set<?> shopsCategorieses) {
		this.shopsCategorieses = shopsCategorieses;
	}

	public Set<?> getAdsShopses() {
		return this.adsShopses;
	}

	public void setAdsShopses(Set<?> adsShopses) {
		this.adsShopses = adsShopses;
	}

}
