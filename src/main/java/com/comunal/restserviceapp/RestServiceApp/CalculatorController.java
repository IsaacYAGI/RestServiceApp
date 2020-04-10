package com.comunal.restserviceapp.RestServiceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@Autowired
    CalculatorService calculatorService;
	
	@PostMapping("/sum")
	public ResponseCalculation sumOperation(@RequestBody NumbersForm numbersForm) {
		System.out.println(numbersForm.toString());
		return new ResponseCalculation(calculatorService.getSum(numbersForm.getNumbers()));
	}
}
