package org.fyp.marketplace.repository;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubCategoryRepository extends MongoRepository<SubCategory,Integer> {
    List<SubCategory> findBy_id(ObjectId _id);
    List<SubCategory> findByCategoryId(ObjectId categoryId);
}
