import java.util.TreeMap;

public class Main {

	public static final TreeMap<Integer, String> TABLE = new TreeMap<Integer, String>();

	public Main() {
		TABLE.put(1000, "M");
		TABLE.put(900, "CM");
		TABLE.put(500, "D");
		TABLE.put(400, "CD");
		TABLE.put(100, "C");
		TABLE.put(90, "XC");
		TABLE.put(50, "L");
		TABLE.put(40, "XL");
		TABLE.put(10, "X");
		TABLE.put(9, "IX");
		TABLE.put(5, "V");
		TABLE.put(4, "IV");
		TABLE.put(1, "I");
	}
	
	public static String roman(int number) {
		int numberTable =  TABLE.floorKey(number);
		
		// Si number est présent dans la table de conversion, on retourne la correspondance
        if (number == numberTable) {
            return TABLE.get(number);
        }
        
        // Sinon on boucle de manière récursive en enlevant le nombre trouvé dans la table
        return TABLE.get(numberTable) + roman(number - numberTable);
	}
	
	public static void main(String[] args) {
		new Main();
		System.out.println(roman(1));
		System.out.println(roman(4));
		System.out.println(roman(1954));
		System.out.println(roman(1990));
	}

}
