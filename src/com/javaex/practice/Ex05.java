package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	//	5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		double[] doubleArray = new double[5];
		doubleArray[0] = 10;
		doubleArray[1] = 20;
		doubleArray[2] = 30;
		doubleArray[3] = 40;
		doubleArray[4] = 50;
		
		for(double i = 0; i <= doubleArray.length; i ++ ) {
			System.out.println(doubleArray +"평균은" + score / 5 +"입니다.");
		}
		
		

	}

}
