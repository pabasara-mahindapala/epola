package org.fyp.marketplace.service;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Order;
import org.fyp.marketplace.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	final OrderRepository orderRepository;
	final AccountService accountService;
	final StockService stockService;
	private String[] paymentType;

	/**
	 * 
	 * @param orderRepository
	 * @param stockService
	 * @param accountService
	 */
	public OrderService(OrderRepository orderRepository, StockService stockService, AccountService accountService) {
		this.orderRepository = orderRepository;
		this.stockService = stockService;
		this.accountService = accountService;
		this.setPaymentType(new String[] { "cash", "online", "card", "coupon", "other" });
	}

	/**
	 * List all orders
	 * 
	 * @return
	 */
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	/**
	 * List order by users emailId
	 * 
	 * @param emailId
	 * @return
	 */
	public List<Order> orderSearchByStockId(ObjectId stockId) {
		return orderRepository.findByStockId(stockId);
	}

	/**
	 * List order by product name
	 * 
	 * @param productName
	 * @return
	 */

	/**
	 * @apiNote Create new order
	 * 
	 * @param order
	 * @return
	 * @throws Exception
	 */
	public Order createOrder(Order order) throws Exception {
		order.setIsActive(true);
		order.setInsertDate(new Date());
		Boolean validation = this.validateOrder(order);
		if (validation) {
			Order newOrder = this.orderRepository.save(order);
			return newOrder;
		} else {
			throw new Exception("Unable to place order, validation fail");
		}
	}

	/**
	 * @apiNote This method can be used for validation of Order
	 * @param order
	 * @return
	 */
	public Boolean validateOrder(Order order) {
		Boolean isValid = true;

		if (isValid && order.getQuanity() < 1) {
			isValid = false;
		}

		return isValid;
	}

	public String[] getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String[] paymentType) {
		this.paymentType = paymentType;
	}
}
