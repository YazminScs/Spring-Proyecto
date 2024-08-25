package com.proyecto.model;

public class Detail_Order {
	private int id_detail_ord;
	private int quantity_detail_ord;
	private double price_unit_detail_ord;
	
	//CONSTRUCTOR
	public Detail_Order() {
		// TODO Auto-generated constructor stub
	}

	public Detail_Order(int id_detail_ord, int quantity_detail_ord, double price_unit_detail_ord) {
		super();
		this.id_detail_ord = id_detail_ord;
		this.quantity_detail_ord = quantity_detail_ord;
		this.price_unit_detail_ord = price_unit_detail_ord;
	}

	//GET Y SET
	public int getId_detail_ord() {
		return id_detail_ord;
	}

	public void setId_detail_ord(int id_detail_ord) {
		this.id_detail_ord = id_detail_ord;
	}

	public int getQuantity_detail_ord() {
		return quantity_detail_ord;
	}

	public void setQuantity_detail_ord(int quantity_detail_ord) {
		this.quantity_detail_ord = quantity_detail_ord;
	}

	public double getPrice_unit_detail_ord() {
		return price_unit_detail_ord;
	}

	public void setPrice_unit_detail_ord(double price_unit_detail_ord) {
		this.price_unit_detail_ord = price_unit_detail_ord;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Detail_Order [id_detail_ord=" + id_detail_ord + ", quantity_detail_ord=" + quantity_detail_ord
				+ ", price_unit_detail_ord=" + price_unit_detail_ord + "]";
	}
}