
package com.dhirajapp.currencyconversionservice;


//import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dhirajapp.currencyconversionservice.bean.CurrencyConversion;

//@FeignClient(name="currency-exchange",url="localhost:8000")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion reteriveExchangeValueFeign(@PathVariable String from ,@PathVariable String to);

	//public CurrencyConversion reteriveExchangeValueFeign(String from, String to);

}
