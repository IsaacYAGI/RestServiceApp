package com.comunal.restserviceapp.RestServiceApp;

import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	private int[] numbers;

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public Calculator(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	public int getSum() {
		int sum = IntStream.of(getNumbers()).sum();
		return sum;
	}

}
