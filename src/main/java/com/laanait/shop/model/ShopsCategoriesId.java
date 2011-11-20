package com.laanait.shop.model;
// default package
// Generated 20 nov. 2011 19:45:07 by Hibernate Tools 3.4.0.CR1

/**
 * ShopsCategoriesId generated by hbm2java
 */
public class ShopsCategoriesId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int shopId;
	private int categoryId;
	private int categoriesCategoryId;

	public ShopsCategoriesId() {
	}

	public ShopsCategoriesId(int shopId, int categoryId,
			int categoriesCategoryId) {
		this.shopId = shopId;
		this.categoryId = categoryId;
		this.categoriesCategoryId = categoriesCategoryId;
	}

	public int getShopId() {
		return this.shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCategoriesCategoryId() {
		return this.categoriesCategoryId;
	}

	public void setCategoriesCategoryId(int categoriesCategoryId) {
		this.categoriesCategoryId = categoriesCategoryId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShopsCategoriesId))
			return false;
		ShopsCategoriesId castOther = (ShopsCategoriesId) other;

		return (this.getShopId() == castOther.getShopId())
				&& (this.getCategoryId() == castOther.getCategoryId())
				&& (this.getCategoriesCategoryId() == castOther
						.getCategoriesCategoryId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getShopId();
		result = 37 * result + this.getCategoryId();
		result = 37 * result + this.getCategoriesCategoryId();
		return result;
	}

}
