package de.blafoo.kata.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicTests {
	
	private final static NumeralsConverter nc = new RomanNumeralsConverter();
	
	@Test
	public void testLiteralI() {
		assertEquals(RomanLiterals.I.toString(), nc.to(1));
	}
	
	@Test
	public void testLiteralV() {
		assertEquals(RomanLiterals.V.toString(), nc.to(5));
	}
	
	@Test
	public void testLiteralX() {
		assertEquals(RomanLiterals.X.toString(), nc.to(10));
	}
	
	@Test
	public void testLiteralL() {
		assertEquals(RomanLiterals.L.toString(), nc.to(50));
	}
	
	@Test
	public void testLiteralC() {
		assertEquals(RomanLiterals.C.toString(), nc.to(100));
	}
	
	@Test
	public void testLiteralD() {
		assertEquals(RomanLiterals.D.toString(), nc.to(500));
	}
	
	@Test
	public void testLiteralM() {
		assertEquals(RomanLiterals.M.toString(), nc.to(1000));
	}
	
	@Test
	public void testLiteralMM() {
		assertEquals(RomanLiterals.M.toString()+RomanLiterals.M.toString(), nc.to(2000));
	}
	
	@Test
	public void testLiteralXXXIII() {
		assertEquals("XXXIII", nc.to(33));
	}
	
	@Test
	public void testLiteralXCVIII() {
		assertEquals("XCVIII", nc.to(98));
	}
	
	@Test
	public void testLiteralMCMXCIX() {
		assertEquals("MCMXCIX", nc.to(1999));
	}
}
