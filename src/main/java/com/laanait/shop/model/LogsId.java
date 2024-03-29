package com.laanait.shop.model;

// Generated 25 janv. 2012 13:59:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * LogsId generated by hbm2java
 */
public class LogsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int logId;
	private String logName;
	private int logDescription;
	private Date logDate;
	private int userId;
	private int companyId;
	private int shopId;
	private int productId;
	private int promoProductsId;

	public LogsId() {
	}

	public LogsId(int logId, String logName, int logDescription, Date logDate,
			int userId, int companyId, int shopId, int productId,
			int promoProductsId) {
		this.logId = logId;
		this.logName = logName;
		this.logDescription = logDescription;
		this.logDate = logDate;
		this.userId = userId;
		this.companyId = companyId;
		this.shopId = shopId;
		this.productId = productId;
		this.promoProductsId = promoProductsId;
	}

	public int getLogId() {
		return this.logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getLogName() {
		return this.logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public int getLogDescription() {
		return this.logDescription;
	}

	public void setLogDescription(int logDescription) {
		this.logDescription = logDescription;
	}

	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getShopId() {
		return this.shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPromoProductsId() {
		return this.promoProductsId;
	}

	public void setPromoProductsId(int promoProductsId) {
		this.promoProductsId = promoProductsId;
	}

}
