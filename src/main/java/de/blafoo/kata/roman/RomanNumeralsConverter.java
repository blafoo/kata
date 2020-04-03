package de.blafoo.kata.roman;

import java.util.TreeMap;

public class RomanNumeralsConverter implements NumeralsConverter {
	private final static TreeMap<Integer, RomanLiterals> literalMapping = new TreeMap<Integer, RomanLiterals>();
	static {
		for(RomanLiterals rl:RomanLiterals.values()) {
			literalMapping.put(rl.getValue(), rl);
		}
	}
	
	@Override
	public String to(int in) {
		String result = "";
		int rest = in;
		while(rest>0) {
			RomanLiterals rl = literalMapping.floorEntry(rest).getValue();
			result+=rl.toString();
			rest-=rl.getValue();
		}
		
		return result;
	}

	@Override
	public int from(String in) {
		throw new NoSuchMethodError("From is not yet supported");
	}
}
