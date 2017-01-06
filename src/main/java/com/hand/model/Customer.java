package com.hand.model;

public class Customer {
	private Integer customer_id;
	private String first_name;
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + "]";
	}
	

}
