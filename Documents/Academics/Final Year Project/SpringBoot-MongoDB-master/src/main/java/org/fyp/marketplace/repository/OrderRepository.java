/**
 * 
 */
package org.fyp.marketplace.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author OmPrakashP
 *
 */
public interface OrderRepository extends MongoRepository<Order, Integer> {

	List<Order> findByStockId(ObjectId stockId);

}
