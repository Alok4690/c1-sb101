package com.day11.Question1;

public interface Y {
	void masalaDosa();
	default void welcomeDrinkY() {
		System.out.println("Welcome Drink from Yhotel");
	}
	static void drinkingWaterY() {
		System.out.println("Drinking Water from YHotel");
	}

}
