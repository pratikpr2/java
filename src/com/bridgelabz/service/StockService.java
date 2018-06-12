package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Stock;

public interface StockService {

	void showStocks(List<Stock> list);
	void totalStockPrice(List<Stock> list);
}
