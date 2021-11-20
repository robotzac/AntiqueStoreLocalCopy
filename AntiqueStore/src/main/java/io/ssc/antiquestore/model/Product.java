package io.ssc.antiquestore.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "Products")
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductNumber", nullable = false)
	private Integer id;

	@Column(name = "ProductName", nullable = false, length = 1000)
	private String productName;

	@Column(name = "ProductDescription", nullable = false, length = 1000)
	private String productDescription;

	@Column(name = "RetailPrice", nullable = false, precision = 10, scale = 2)
	private BigDecimal retailPrice;

	@Column(name = "QuantityOnHand")
	private Integer quantityOnHand;

	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}