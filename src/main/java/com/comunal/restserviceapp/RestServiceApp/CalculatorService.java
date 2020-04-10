package com.comunal.restserviceapp.RestServiceApp;

import java.util.stream.IntStream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("calculatorService")
public class CalculatorService {
	private int[] numbers;

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public CalculatorService(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	public int getSum() {
		int sum = IntStream.of(getNumbers()).sum();
		return sum;
	}
	
	public int getSum(int[] numbers) {
		setNumbers(numbers);
		return getSum();
	}

}
