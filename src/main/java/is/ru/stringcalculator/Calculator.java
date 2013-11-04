package is.ru.stringcalculator;


public class Calculator {
    
	public static int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}

		if (numbers.contains(",") || numbers.contains("\n")) {
			// String[] result = splitString(numbers);
			
			// return sum(result);

			int[] arr = onlyInts(numbers);
			int total = 0;
			for (int i : arr) {
				total += i;
			}
			return total;
		}

		return toInt(numbers);
	}


	private static int toInt(String s) {
		return Integer.parseInt(s);
	}

	private static String[] splitString(String s) {
		return s.split("\\,|\n");
		
	}

	private static String[] splitStringNewline(String s) {
		return s.split("\n");
	}

	private static int sum(String[] n) {
		int total = 0;
		for (String i :  n) {
				total += toInt(i);
			}
		return total;
	}

	private static int[] onlyInts(String s) {
		int[] arr;
		arr = new int[s.length()];
		int i = 0;
		String[] foo = s.split("");
		for (String text : foo) {
			if (isInteger(text)) {
				int number = toInt(text);
				arr[i] = number;
				i++;
			}
		}
		return arr;
	}

	private static boolean isInteger(String s) {
		try {
			toInt(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

}
