package org.fyp.marketplace.service;

import java.util.List;

import org.fyp.marketplace.model.Stock;
import org.fyp.marketplace.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	final StockRepository stockRepository;

	public StockService(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	public List<Stock> getAllStocks() {
		return this.stockRepository.findAll();
	}

}
