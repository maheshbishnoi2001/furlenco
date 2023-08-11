package com.furlencoapp.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customers")
public class Customer {
    @Id
    private Integer customerId;
    private String customerName;
    private Address address;
    private List<String> orderList;
    private List<String> wishList;
    private LocalDate startDate;
    private LocalDate endDate;
	public Customer(Integer customerId, String customerName, Address address, List<String> orderList, List<String> wishList,
			LocalDate startDate, LocalDate endDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.orderList = orderList;
		this.wishList = wishList;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<String> orderList) {
		this.orderList = orderList;
	}
	public List<String> getWishList() {
		return wishList;
	}
	public void setWishList(List<String> wishList) {
		this.wishList = wishList;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", orderList=" + orderList + ", wishList=" + wishList + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}

    
}