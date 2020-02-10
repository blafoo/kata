package de.blafoo.kata.roman;

public class RomanNumerals implements NumeralsConverter {

	@Override
	public String to(int in) {
		return "I";
	}

	@Override
	public int from(String in) {
		return -1;
	}
}
