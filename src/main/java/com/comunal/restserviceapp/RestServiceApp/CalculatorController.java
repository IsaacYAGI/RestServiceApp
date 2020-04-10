package com.comunal.restserviceapp.RestServiceApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@GetMapping("/sum")
	public ResponseCalculation sumOperation(@RequestBody NumbersForm numbersForm) {
		System.out.println(numbersForm.toString());
		Calculator calculator = new Calculator(numbersForm.getNumbers());
		return new ResponseCalculation(calculator.getSum());
	}
}
