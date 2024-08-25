package com.proyecto.model;

import java.util.Arrays;

public class Product {
	private int id_prod;
	private String name_prod;
	private String desc_prod;
	private double price_prod;
	private int stock_prod;
	private byte[] image_prod;
	
	//CONSTRUCTORES:
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id_prod, String name_prod, String desc_prod, double price_prod, int stock_prod,
			byte[] image_prod) {
		super();
		this.id_prod = id_prod;
		this.name_prod = name_prod;
		this.desc_prod = desc_prod;
		this.price_prod = price_prod;
		this.stock_prod = stock_prod;
		this.image_prod = image_prod;
	}

	//METODOS GET Y SET:
	public int getId_prod() {
		return id_prod;
	}

	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}

	public String getName_prod() {
		return name_prod;
	}

	public void setName_prod(String name_prod) {
		this.name_prod = name_prod;
	}

	public String getDesc_prod() {
		return desc_prod;
	}

	public void setDesc_prod(String desc_prod) {
		this.desc_prod = desc_prod;
	}

	public double getPrice_prod() {
		return price_prod;
	}

	public void setPrice_prod(double price_prod) {
		this.price_prod = price_prod;
	}

	public int getStock_prod() {
		return stock_prod;
	}

	public void setStock_prod(int stock_prod) {
		this.stock_prod = stock_prod;
	}

	public byte[] getImage_prod() {
		return image_prod;
	}

	public void setImage_prod(byte[] image_prod) {
		this.image_prod = image_prod;
	}

	//TO STRING:
	@Override
	public String toString() {
		return "Product [id_prod=" + id_prod + ", name_prod=" + name_prod + ", desc_prod=" + desc_prod + ", price_prod="
				+ price_prod + ", stock_prod=" + stock_prod + ", image_prod=" + Arrays.toString(image_prod) + "]";
	}
}