package test;

import java.text.DecimalFormat;

public class CalendarExample {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		DecimalFormat df;
		
		// 정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(number));
		
		// 소수 첫번째 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(number));
		
	}


}