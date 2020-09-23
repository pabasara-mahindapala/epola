/**
 * 
 */
package org.fyp.marketplace.controller;

import java.util.ArrayList;
import java.util.List;

import org.fyp.marketplace.model.Stock;
import org.fyp.marketplace.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OmPrakashP
 *
 */

@RestController
@RequestMapping("/rest/stock")
public class StockController {

	final StockService stockService;

	/**
	 * @param stockService 
	 */
	public StockController(StockService stockService) {
		super();
		this.stockService = stockService ; 
	}

	@GetMapping("all")
	public List<Stock> listAllStock( ) {
		try {
			return this.stockService.getAllStocks();
		} catch (Exception e) {
			//Log error
			return new ArrayList<Stock>();
		}
	}
	

	/**
	 * Few other methods which we can implement 
	 * 1. updateStockDetails
	 * 2. removeStock
	 * 3. validationStock
	 */
}
