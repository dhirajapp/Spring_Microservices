package com.dhirajapp.limitsservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dhirajapp.limitsservice.bean.Limits;

@RestController
public class LimitsControler {
	@Autowired
	private Limits limits;
	
   @GetMapping("/limits")
	public Limits retriveAll() {
	   return new Limits(limits.getMinimum(),limits.getMaximum());
   }
}
