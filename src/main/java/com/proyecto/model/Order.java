package com.proyecto.model;

import java.sql.Date;

public class Order {
	private int id_order;
	private String delivery_method_ord;
	private String direction_ord;
	private String type_comp_ord;
	private double amount_ord;
	private Date date_ord;
	
	//CONSTRUCTOR
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id_order, String delivery_method_ord, String direction_ord, String type_comp_ord,
			double amount_ord, Date date_ord) {
		super();
		this.id_order = id_order;
		this.delivery_method_ord = delivery_method_ord;
		this.direction_ord = direction_ord;
		this.type_comp_ord = type_comp_ord;
		this.amount_ord = amount_ord;
		this.date_ord = date_ord;
	}

	//METODO GET Y SET
	public int getId_order() {
		return id_order;
	}

	public void setId_order(int id_order) {
		this.id_order = id_order;
	}

	public String getDelivery_method_ord() {
		return delivery_method_ord;
	}

	public void setDelivery_method_ord(String delivery_method_ord) {
		this.delivery_method_ord = delivery_method_ord;
	}

	public String getDirection_ord() {
		return direction_ord;
	}

	public void setDirection_ord(String direction_ord) {
		this.direction_ord = direction_ord;
	}

	public String getType_comp_ord() {
		return type_comp_ord;
	}

	public void setType_comp_ord(String type_comp_ord) {
		this.type_comp_ord = type_comp_ord;
	}

	public double getAmount_ord() {
		return amount_ord;
	}

	public void setAmount_ord(double amount_ord) {
		this.amount_ord = amount_ord;
	}

	public Date getDate_ord() {
		return date_ord;
	}

	public void setDate_ord(Date date_ord) {
		this.date_ord = date_ord;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Order [id_order=" + id_order + ", delivery_method_ord=" + delivery_method_ord + ", direction_ord="
				+ direction_ord + ", type_comp_ord=" + type_comp_ord + ", amount_ord=" + amount_ord + ", date_ord="
				+ date_ord + "]";
	}
}