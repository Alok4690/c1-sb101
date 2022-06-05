package com.day11.Question1;

public interface X {
	void chickenBiryani();
	default void welcomeDrink() {
		System.out.println("Welcome Drink from Xhotel");
	}
	static void drinkingWater() {
		System.out.println("Drinking Water from XHotel");
	}

}
