package com.qa.main;

public class Conditionals {
	public int conditionalsInput(int numberOne, int numberTwo, boolean inputBool) {
		if (numberOne % 2 == 0 || numberTwo % 2 == 0) {
			System.out.println("Whoops! Even number");
			return 0;
		}
		
		if (inputBool == true) {
			return numberOne + numberTwo;
		}
		else {
			return numberOne * numberTwo;
		}
	}

}
