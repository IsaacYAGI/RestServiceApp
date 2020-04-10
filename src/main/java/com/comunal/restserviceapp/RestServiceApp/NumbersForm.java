package com.comunal.restserviceapp.RestServiceApp;

public class NumbersForm {
	private int[] numbers;

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	
	public String toString() {
		String result = "";
		for (int i : numbers) {
			result = result.concat(Integer.toString(i));
		}
		return result;
	}
}
