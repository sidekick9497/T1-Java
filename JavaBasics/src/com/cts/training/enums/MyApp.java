package com.cts.training.enums;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDays day = WeekDays.THURSDAY;
		System.out.println(day);
		System.out.println("Working hrs on Thursday : " + WeekDays.THURSDAY.getWorkingHrs());
		System.out.println("Working hrs on SUNDAY : " + WeekDays.SUNDAY.getWorkingHrs());
	}

}
