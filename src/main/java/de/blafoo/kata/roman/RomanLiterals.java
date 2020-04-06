package de.blafoo.kata.roman;

public enum RomanLiterals {
	I(1),
	IV(4),
	V(5),
	IX(9),
	X(10),
	XL(40),
	L(50),
	XC(90),	
	C(100),
	CD(400),
	D(500),
	CM(900),
	M(1000);
	
	final int value;
	

	RomanLiterals(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.name();
	}
}
