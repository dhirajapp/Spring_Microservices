package com.dhirajapp.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dhirajapp.currencyexchangeservice.bean.CurrencyExchane;

@RestController
public class CurrencyExchangeController {
    @Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchane reteriveExchangeValue(@PathVariable String from ,@PathVariable String to) {
		CurrencyExchane currencyExchange=new CurrencyExchane(1000L,from,to,BigDecimal.valueOf(50));
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}
	
}
