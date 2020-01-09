package com.cts.training.enums;

public enum WeekDays {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	// public int workingHrs;
	
	private WeekDays() {
		// TODO Auto-generated constructor stub
		// this.workingHrs = 8;
	}
	public int getWorkingHrs() {
		// need to check which day has called this method
		if(this == SATURDAY || this == SUNDAY)
			return 0;
		return 8;
			// return this.workingHrs - 8;
		// return this.workingHrs;
	}
}
