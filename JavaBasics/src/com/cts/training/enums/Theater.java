package com.cts.training.enums;

public enum Theater {
	SILVER,
	GOLD,
	PLATINUM;
	
	private int rate;
	
	private Theater() {
		// TODO Auto-generated constructor stub
		this.rate = 100;
	}
	
	public int getRate() {
		// this : object which is calling current method
		if(this == SILVER)
			return this.rate;
		if(this == GOLD)
			return 130;
		if(this == PLATINUM)
			return 150;
		return 0;
	}
}
