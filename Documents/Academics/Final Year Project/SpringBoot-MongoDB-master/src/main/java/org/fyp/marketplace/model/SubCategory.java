package org.fyp.marketplace.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "subCategory")
public class SubCategory {
    @Id
    @Field(value = "_id")
    private ObjectId _id;

    private String subCategoryName;

    public SubCategory(ObjectId _id, String subCategoryName) {
        this._id = _id;
        this.subCategoryName = subCategoryName;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
