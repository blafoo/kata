package de.blafoo.kata.roman;

/**
 * @author Mark
 *
 */
public interface NumeralsConverter {
	
	/**
	 * Zahl in arabischer Schreibweise (z.B. 4711) in das 'Zielsystem' umwandeln
	 * 
	 * @param in Zahl in arabischer Schreibweise (z.B. 4711)
	 * @return  Zahl im 'Zielsystem' (z.B. MMMMDCCXI für römische Zahlen)
	 */
	public String to(int in);
	
	/**
	 * Zahl aus 'Zielsystem' in die arabischer Schreibweise (z.B. 4711) umwandeln
	 * 
	 * @param in Zahl im 'Zielsystem' (z.B. MMMMDCCXI für römische Zahlen)
	 * @return  Zahl in arabischer Schreibweise (z.B. 4711)
	 */
	public int from(String in);

}
