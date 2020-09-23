/**
 * 
 */
package org.fyp.marketplace.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author OmPrakashP
 *
 */
@Document(collection = "order")
public class Order {
	@Id
	@Field(value = "_id")
	private ObjectId _id;

	private Date insertDate = new Date();
	private Boolean isActive;
	private ObjectId stockId;
	private ObjectId producerId;
	private ObjectId customerId;
	private Integer quanity;

	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 * 
	 */

	public ObjectId get_id() {
		return _id;
	}

	public Order(ObjectId _id, Date insertDate, Boolean isActive, ObjectId stockId, ObjectId producerId,
			ObjectId customerId, Integer quanity) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.stockId = stockId;
		this.producerId = producerId;
		this.customerId = customerId;
		this.quanity = quanity;
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

	public ObjectId getStockId() {
		return stockId;
	}

	public void setStockId(ObjectId stockId) {
		this.stockId = stockId;
	}

	public ObjectId getProducerId() {
		return producerId;
	}

	public void setProducerId(ObjectId producerId) {
		this.producerId = producerId;
	}

	public ObjectId getCustomerId() {
		return customerId;
	}

	public void setCustomerId(ObjectId customerId) {
		this.customerId = customerId;
	}

	public Integer getQuanity() {
		return quanity;
	}

	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

}
