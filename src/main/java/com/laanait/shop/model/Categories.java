package com.laanait.shop.model;

// Generated 20 nov. 2011 22:24:37 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories implements java.io.Serializable {

	private Integer categoryId;
	private String categoryName;
	private String categoryDescription;
	private Integer categoryParent;
	private Set shopsCategorieses = new HashSet(0);
	private Set companiesCategorieses = new HashSet(0);
	private Set productses = new HashSet(0);

	public Categories() {
	}

	public Categories(String categoryName, String categoryDescription,
			Integer categoryParent, Set shopsCategorieses,
			Set companiesCategorieses, Set productses) {
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryParent = categoryParent;
		this.shopsCategorieses = shopsCategorieses;
		this.companiesCategorieses = companiesCategorieses;
		this.productses = productses;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Integer getCategoryParent() {
		return this.categoryParent;
	}

	public void setCategoryParent(Integer categoryParent) {
		this.categoryParent = categoryParent;
	}

	public Set getShopsCategorieses() {
		return this.shopsCategorieses;
	}

	public void setShopsCategorieses(Set shopsCategorieses) {
		this.shopsCategorieses = shopsCategorieses;
	}

	public Set getCompaniesCategorieses() {
		return this.companiesCategorieses;
	}

	public void setCompaniesCategorieses(Set companiesCategorieses) {
		this.companiesCategorieses = companiesCategorieses;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}
