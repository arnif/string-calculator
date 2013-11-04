package is.ru.stringcalculator;


public class Calculator {
    
	public static int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}

		if (numbers.contains(",")) {
			String[] sum = numbers.split(",");
			int total = 0;
			for (String n : sum) {
				total += toInt(n);
			}
			return total;
		}

		return toInt(numbers);
	}


	private static int toInt(String s) {
		return Integer.parseInt(s);
	}

}
