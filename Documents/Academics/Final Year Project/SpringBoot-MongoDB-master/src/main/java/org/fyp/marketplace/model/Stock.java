package org.fyp.marketplace.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "stock")
public class Stock {
	@Id
	@Field(value = "_id")
	private ObjectId _id;

	private Date insertDate = new Date();
	private Boolean isActive;
	private ObjectId productId;
	private ObjectId producerId;
	private String quantityUnit;
	private Integer quantity;
	private String quality;
	private Float pricePerUnit;

	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 */
	public Stock(ObjectId _id, Date insertDate, Boolean isActive, ObjectId productId, ObjectId producerId,
			String quantityUnit, Integer quantity, String quality, Float pricePerUnit) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.productId = productId;
		this.producerId = producerId;
		this.quantityUnit = quantityUnit;
		this.quantity = quantity;
		this.quality = quality;
		this.pricePerUnit = pricePerUnit;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ObjectId getProductId() {
		return productId;
	}

	public void setProductId(ObjectId productId) {
		this.productId = productId;
	}

	public ObjectId getProducerId() {
		return producerId;
	}

	public void setProducerId(ObjectId producerId) {
		this.producerId = producerId;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantity_unit) {
		this.quantityUnit = quantity_unit;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Float getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

}
