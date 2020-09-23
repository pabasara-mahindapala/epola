/**
 * 
 */
package org.fyp.marketplace.repository;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author OmPrakashP
 *
 */
public interface StockRepository extends MongoRepository<Stock, Integer> {
	Stock findByProductId(ObjectId productId);
}
