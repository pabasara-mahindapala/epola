package org.fyp.marketplace.repository;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,Integer> {
    List<Product> findBy_id(ObjectId _id);
    List<Product> findByCategoryId(ObjectId categoryId);
    List<Product> findBySubCategoryId(ObjectId subCategoryId);
    List<Product> findByProducerId(ObjectId producerId);
}
