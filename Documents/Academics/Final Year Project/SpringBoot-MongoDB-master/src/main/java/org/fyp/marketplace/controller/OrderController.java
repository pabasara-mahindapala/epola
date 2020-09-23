/**
 * 
 */
package org.fyp.marketplace.controller;

import java.util.ArrayList;
import java.util.List;

import org.fyp.marketplace.model.Order;
import org.fyp.marketplace.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 *
 */
@RestController
@RequestMapping("/rest/order")
public class OrderController {
	final OrderService orderService;

	/**
	 * @param orderService
	 */
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping("/all")
	public List<Order> listAllOrder() {
		try {
			return this.orderService.getAllOrders();
		} catch (Exception e) {
			// Log error
			return new ArrayList<Order>();
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) throws Exception {
		ResponseEntity<Order> result;
		try {
			this.orderService.createOrder(order);
			result = new ResponseEntity<>(order, HttpStatus.OK);
		} catch (Exception e) {
			result = new ResponseEntity<>(order, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}

	/**
	 * Few other methods which we can implement 1. updateOrderDetails 2. removeOrder
	 */

}
