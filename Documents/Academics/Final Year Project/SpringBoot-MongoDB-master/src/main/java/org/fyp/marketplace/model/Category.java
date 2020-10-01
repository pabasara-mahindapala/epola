package org.fyp.marketplace.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "category")
public class Category {
    @Id
    @Field(value = "_id")
    private ObjectId _id;

    private ObjectId subCategoryId;
    private String categoryName;

    public Category(ObjectId _id, ObjectId subCategoryId, String categoryName) {
        this._id = _id;
        this.subCategoryId = subCategoryId;
        this.categoryName = categoryName;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(ObjectId subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
