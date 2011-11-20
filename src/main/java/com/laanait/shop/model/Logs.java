package com.laanait.shop.model;

// default package
// Generated 20 nov. 2011 19:45:07 by Hibernate Tools 3.4.0.CR1

/**
 * Logs generated by hbm2java
 */
public class Logs implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LogsId id;
	private Shops shops;
	private Users users;
	private Products products;
	private Companies companies;
	private ProductsPromo productsPromo;

	public Logs() {
	}

	public Logs(LogsId id, Shops shops, Users users, Products products,
			Companies companies, ProductsPromo productsPromo) {
		this.id = id;
		this.shops = shops;
		this.users = users;
		this.products = products;
		this.companies = companies;
		this.productsPromo = productsPromo;
	}

	public LogsId getId() {
		return this.id;
	}

	public void setId(LogsId id) {
		this.id = id;
	}

	public Shops getShops() {
		return this.shops;
	}

	public void setShops(Shops shops) {
		this.shops = shops;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Companies getCompanies() {
		return this.companies;
	}

	public void setCompanies(Companies companies) {
		this.companies = companies;
	}

	public ProductsPromo getProductsPromo() {
		return this.productsPromo;
	}

	public void setProductsPromo(ProductsPromo productsPromo) {
		this.productsPromo = productsPromo;
	}

}