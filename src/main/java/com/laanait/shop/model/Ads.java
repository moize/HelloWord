package com.laanait.shop.model;

// default package
// Generated 20 nov. 2011 19:45:07 by Hibernate Tools 3.4.0.CR1

/**
 * Ads generated by hbm2java
 */
public class Ads implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int adsId;

	public Ads() {
	}

	public Ads(int adsId) {
		this.adsId = adsId;
	}

	public int getAdsId() {
		return this.adsId;
	}

	public void setAdsId(int adsId) {
		this.adsId = adsId;
	}

}
