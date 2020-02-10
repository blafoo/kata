package de.blafoo.kata.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest 
{
    @Test
    public void test1() {
    	
        assertEquals("I", new RomanNumerals().to(1));
        
    }
    
    @Test
    public void test5() {
    	
        assertEquals("V", new RomanNumerals().to(5));
        
    }
    
    @Test
    public void tests() {
    	
    	assertEquals("XCVIII", new RomanNumerals().to(98));
    	assertEquals("MCMLXXXIV", new RomanNumerals().to(1984));
    	assertEquals("MCMXCIX", new RomanNumerals().to(1999));
    	assertEquals("MMXX", new RomanNumerals().to(2020));
    }
}
