package com.dhirajapp.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dhirajapp.currencyexchangeservice.bean.CurrencyExchane;
import com.dhirajapp.currencyexchangeservice.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeRepository currencyExchaneRepo;
	
    @Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchane reteriveExchangeValue(@PathVariable String from ,@PathVariable String to) {
		
		//CurrencyExchane currencyExchange=new CurrencyExchane(1000L,from,to,BigDecimal.valueOf(50));
		
		CurrencyExchane currencyExchange=currencyExchaneRepo.findByFromAndTo(from, to);
		if(currencyExchange==null) {
			throw new RuntimeException("unable to find data from"+from+"to"+to);
		}
		
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}
	
}
