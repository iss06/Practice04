package com.javaex.practice;

public class Ex02 {
	// double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.
	public static void main(String[] args) {
		double[] doubleArray = new double[3];
		doubleArray[0] = 1.2;
		doubleArray[1] = 3.3;
		doubleArray[2] = 6.7;

		for (int i = doubleArray.length - 1; i >= 0; i--) {
			System.out.println(doubleArray[i]);
		}
	}

}
