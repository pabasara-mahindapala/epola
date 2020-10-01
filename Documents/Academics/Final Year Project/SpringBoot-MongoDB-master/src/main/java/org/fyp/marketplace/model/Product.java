package org.fyp.marketplace.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
public class Product {
    @Id
    @Field(value = "_id")
    private ObjectId _id;

    private String productName;
    private double unitPrice;
    private double amount;
    private String availablePeriod;
    private String cultivationMethod;
    private String location;
    private ObjectId producerId;
    private ObjectId categoryId;
    private ObjectId subCategoryId;

    public Product(ObjectId _id, String productName, double unitPrice, double amount, String availablePeriod, String cultivationMethod, String location, ObjectId producerId, ObjectId categoryId, ObjectId subCategoryId) {
        this._id = _id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.availablePeriod = availablePeriod;
        this.cultivationMethod = cultivationMethod;
        this.location = location;
        this.producerId = producerId;
        this.categoryId = categoryId;
        this.subCategoryId = subCategoryId;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAvailablePeriod() {
        return availablePeriod;
    }

    public void setAvailablePeriod(String availablePeriod) {
        this.availablePeriod = availablePeriod;
    }

    public String getCultivationMethod() {
        return cultivationMethod;
    }

    public void setCultivationMethod(String cultivationMethod) {
        this.cultivationMethod = cultivationMethod;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ObjectId getProducerId() {
        return producerId;
    }

    public void setProducerId(ObjectId producerId) {
        this.producerId = producerId;
    }

    public ObjectId getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(ObjectId categoryId) {
        this.categoryId = categoryId;
    }

    public ObjectId getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(ObjectId subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}
