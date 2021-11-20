package io.ssc.antiquestore.model;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "Orders")
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OrderNumber", nullable = false)
	private Integer id;

	@Column(name = "OrderDate", nullable = false)
	private LocalDate orderDate;

	@Column(name = "ShipDate")
	private LocalDate shipDate;

	@Column(name = "QuantitySold")
	private Integer quantitySold;

	@Column(name = "ProductNumber")
	private Integer productNumber;

	@Column(name = "CustomerName", length = 45)
	private String customerName;

	@Column(name = "OrderNotes", length = 45)
	private String orderNotes;

	public String getOrderNotes() {
		return orderNotes;
	}

	public void setOrderNotes(String orderNotes) {
		this.orderNotes = orderNotes;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}