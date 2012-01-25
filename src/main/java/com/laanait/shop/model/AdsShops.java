package com.laanait.shop.model;

// Generated 25 janv. 2012 13:59:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AdsShops generated by hbm2java
 */
public class AdsShops implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer adsShopsId;
	private Shops shops;
	private String adsShopsDescription;
	private String adsShopsImage;
	private int adsShopsCategory;
	private Date adsShopsSDate;
	private Date adsShopsEDate;
	private int adsShopsStatus;
	private Date adsShopsDate;

	public AdsShops() {
	}

	public AdsShops(Shops shops, String adsShopsDescription,
			String adsShopsImage, int adsShopsCategory, Date adsShopsSDate,
			Date adsShopsEDate, int adsShopsStatus, Date adsShopsDate) {
		this.shops = shops;
		this.adsShopsDescription = adsShopsDescription;
		this.adsShopsImage = adsShopsImage;
		this.adsShopsCategory = adsShopsCategory;
		this.adsShopsSDate = adsShopsSDate;
		this.adsShopsEDate = adsShopsEDate;
		this.adsShopsStatus = adsShopsStatus;
		this.adsShopsDate = adsShopsDate;
	}

	public Integer getAdsShopsId() {
		return this.adsShopsId;
	}

	public void setAdsShopsId(Integer adsShopsId) {
		this.adsShopsId = adsShopsId;
	}

	public Shops getShops() {
		return this.shops;
	}

	public void setShops(Shops shops) {
		this.shops = shops;
	}

	public String getAdsShopsDescription() {
		return this.adsShopsDescription;
	}

	public void setAdsShopsDescription(String adsShopsDescription) {
		this.adsShopsDescription = adsShopsDescription;
	}

	public String getAdsShopsImage() {
		return this.adsShopsImage;
	}

	public void setAdsShopsImage(String adsShopsImage) {
		this.adsShopsImage = adsShopsImage;
	}

	public int getAdsShopsCategory() {
		return this.adsShopsCategory;
	}

	public void setAdsShopsCategory(int adsShopsCategory) {
		this.adsShopsCategory = adsShopsCategory;
	}

	public Date getAdsShopsSDate() {
		return this.adsShopsSDate;
	}

	public void setAdsShopsSDate(Date adsShopsSDate) {
		this.adsShopsSDate = adsShopsSDate;
	}

	public Date getAdsShopsEDate() {
		return this.adsShopsEDate;
	}

	public void setAdsShopsEDate(Date adsShopsEDate) {
		this.adsShopsEDate = adsShopsEDate;
	}

	public int getAdsShopsStatus() {
		return this.adsShopsStatus;
	}

	public void setAdsShopsStatus(int adsShopsStatus) {
		this.adsShopsStatus = adsShopsStatus;
	}

	public Date getAdsShopsDate() {
		return this.adsShopsDate;
	}

	public void setAdsShopsDate(Date adsShopsDate) {
		this.adsShopsDate = adsShopsDate;
	}

}
