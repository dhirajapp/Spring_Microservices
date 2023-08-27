package com.dhirajapp.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhirajapp.currencyexchangeservice.bean.CurrencyExchane;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchane, Long>{
	CurrencyExchane findByFromAndTo(String from,String to);
	 
}
