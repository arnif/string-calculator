package is.ru.stringcalculator;


public class Calculator {
    
	public static int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}

		if (numbers.contains(",")) {
			String[] result = splitString(numbers);
			
			return sum(result);
		}

		return toInt(numbers);
	}


	private static int toInt(String s) {
		return Integer.parseInt(s);
	}

	private static String[] splitString(String s) {
		return s.split(",");
	}

	private static int sum(String[] n) {
		int total = 0;
		for (String i :  n) {
				total += toInt(i);
			}
		return total;
	}

}
