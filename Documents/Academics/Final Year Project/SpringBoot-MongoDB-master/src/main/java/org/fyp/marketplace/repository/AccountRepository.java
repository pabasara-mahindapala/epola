/**
 * 
 */
package org.fyp.marketplace.repository;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author OmPrakashP
 *
 */
public interface AccountRepository extends MongoRepository<Account, Integer> {
	Account findBy_id(ObjectId _id);
}
