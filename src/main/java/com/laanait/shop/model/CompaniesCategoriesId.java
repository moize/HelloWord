package com.laanait.shop.model;

// Generated 20 nov. 2011 22:24:37 by Hibernate Tools 3.4.0.CR1

/**
 * CompaniesCategoriesId generated by hbm2java
 */
public class CompaniesCategoriesId implements java.io.Serializable {

	private int companyId;
	private int categoryId;
	private int categoriesCategoryId;

	public CompaniesCategoriesId() {
	}

	public CompaniesCategoriesId(int companyId, int categoryId,
			int categoriesCategoryId) {
		this.companyId = companyId;
		this.categoryId = categoryId;
		this.categoriesCategoryId = categoriesCategoryId;
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
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
		if (!(other instanceof CompaniesCategoriesId))
			return false;
		CompaniesCategoriesId castOther = (CompaniesCategoriesId) other;

		return (this.getCompanyId() == castOther.getCompanyId())
				&& (this.getCategoryId() == castOther.getCategoryId())
				&& (this.getCategoriesCategoryId() == castOther
						.getCategoriesCategoryId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCompanyId();
		result = 37 * result + this.getCategoryId();
		result = 37 * result + this.getCategoriesCategoryId();
		return result;
	}

}
