package com.laanait.shop.model;

// Generated 20 nov. 2011 22:24:37 by Hibernate Tools 3.4.0.CR1

/**
 * ShopsCategories generated by hbm2java
 */
public class ShopsCategories implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ShopsCategoriesId id;
	private Shops shops;
	private Categories categories;

	public ShopsCategories() {
	}

	public ShopsCategories(ShopsCategoriesId id, Shops shops,
			Categories categories) {
		this.id = id;
		this.shops = shops;
		this.categories = categories;
	}

	public ShopsCategoriesId getId() {
		return this.id;
	}

	public void setId(ShopsCategoriesId id) {
		this.id = id;
	}

	public Shops getShops() {
		return this.shops;
	}

	public void setShops(Shops shops) {
		this.shops = shops;
	}

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

}
