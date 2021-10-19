package com.in28minutes.database.databasedemo;

public class MyMath {

	int sum( int[] numbers ) {
		int sum = 0;
		for (int i : numbers ) {
			sum += i;
		}
		return sum;
	}
}
