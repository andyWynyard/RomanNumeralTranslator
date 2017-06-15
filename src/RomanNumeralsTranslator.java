
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RomanNumeralsTranslator {
	private int input;

	public RomanNumeralsTranslator() {

	}

	public RomanNumeralsTranslator(int input) {
		this.input = input;

	}

	// hard code roman numerals
	public String translate(int input) {
		Map<Integer, String> romanMap = new LinkedHashMap<>();
		romanMap.put(1000, "M");
		romanMap.put(900, "CM");
		romanMap.put(500, "D");
		romanMap.put(400, "CD");
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(3, "III");
		romanMap.put(2, "II");
		romanMap.put(1, "I");

		String returnVal = "";
		// keys within map mapName.keySet()
		Set<Integer> keys = romanMap.keySet();
		for (Integer k : keys) {
			int numOfValues = input / k;
			input = input % k;
			for (int i = 0; i < numOfValues; i++) {
				// System.out.print(romanMap.get(k));
				returnVal = returnVal + romanMap.get(k);
			}
		}
		// String[] inputVal = s.split("");

		return returnVal;

	}

}