package com.proyecto.model;

import java.sql.Date;

public class Order_Temp {
	private int id_order_temp;
	private int quantity_order_temp;
	private Date date_order_temp;
	
	//CONSTRUCTOR
	public Order_Temp() {
		// TODO Auto-generated constructor stub
	}

	public Order_Temp(int id_order_temp, int quantity_order_temp, Date date_order_temp) {
		super();
		this.id_order_temp = id_order_temp;
		this.quantity_order_temp = quantity_order_temp;
		this.date_order_temp = date_order_temp;
	}

	//GET Y SET
	public int getId_order_temp() {
		return id_order_temp;
	}

	public void setId_order_temp(int id_order_temp) {
		this.id_order_temp = id_order_temp;
	}

	public int getQuantity_order_temp() {
		return quantity_order_temp;
	}

	public void setQuantity_order_temp(int quantity_order_temp) {
		this.quantity_order_temp = quantity_order_temp;
	}

	public Date getDate_order_temp() {
		return date_order_temp;
	}

	public void setDate_order_temp(Date date_order_temp) {
		this.date_order_temp = date_order_temp;
	}

	//CONSTRUCTOR
	@Override
	public String toString() {
		return "Order_Temp [id_order_temp=" + id_order_temp + ", quantity_order_temp=" + quantity_order_temp
				+ ", date_order_temp=" + date_order_temp + "]";
	}
}