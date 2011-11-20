package com.laanait.shop.model;

// Generated 20 nov. 2011 22:24:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AdsProducts generated by hbm2java
 */
public class AdsProducts implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer adsProductsId;
	private Products products;
	private String adsProductsDescription;
	private String adsProductsImage;
	private int adsProductsCategory;
	private Date adsProductsSDate;
	private Date adsProductsEDate;
	private int adsProductsStatus;
	private Date adsProductsDate;

	public AdsProducts() {
	}

	public AdsProducts(Products products, String adsProductsDescription,
			String adsProductsImage, int adsProductsCategory,
			Date adsProductsSDate, Date adsProductsEDate,
			int adsProductsStatus, Date adsProductsDate) {
		this.products = products;
		this.adsProductsDescription = adsProductsDescription;
		this.adsProductsImage = adsProductsImage;
		this.adsProductsCategory = adsProductsCategory;
		this.adsProductsSDate = adsProductsSDate;
		this.adsProductsEDate = adsProductsEDate;
		this.adsProductsStatus = adsProductsStatus;
		this.adsProductsDate = adsProductsDate;
	}

	public Integer getAdsProductsId() {
		return this.adsProductsId;
	}

	public void setAdsProductsId(Integer adsProductsId) {
		this.adsProductsId = adsProductsId;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getAdsProductsDescription() {
		return this.adsProductsDescription;
	}

	public void setAdsProductsDescription(String adsProductsDescription) {
		this.adsProductsDescription = adsProductsDescription;
	}

	public String getAdsProductsImage() {
		return this.adsProductsImage;
	}

	public void setAdsProductsImage(String adsProductsImage) {
		this.adsProductsImage = adsProductsImage;
	}

	public int getAdsProductsCategory() {
		return this.adsProductsCategory;
	}

	public void setAdsProductsCategory(int adsProductsCategory) {
		this.adsProductsCategory = adsProductsCategory;
	}

	public Date getAdsProductsSDate() {
		return this.adsProductsSDate;
	}

	public void setAdsProductsSDate(Date adsProductsSDate) {
		this.adsProductsSDate = adsProductsSDate;
	}

	public Date getAdsProductsEDate() {
		return this.adsProductsEDate;
	}

	public void setAdsProductsEDate(Date adsProductsEDate) {
		this.adsProductsEDate = adsProductsEDate;
	}

	public int getAdsProductsStatus() {
		return this.adsProductsStatus;
	}

	public void setAdsProductsStatus(int adsProductsStatus) {
		this.adsProductsStatus = adsProductsStatus;
	}

	public Date getAdsProductsDate() {
		return this.adsProductsDate;
	}

	public void setAdsProductsDate(Date adsProductsDate) {
		this.adsProductsDate = adsProductsDate;
	}

}
