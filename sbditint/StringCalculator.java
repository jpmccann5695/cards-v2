package sbditint;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
	public int add(String input) throws Exception {
		if(input.equals("")) {
			return 0;
		}
		else {
			int sum = 0;
			ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(input.split(",")));
			String negativeNumbers = "";			
			for(String number:numbers) {
				if(number.contains("-")) {
					negativeNumbers+= number;
				}
				else
					sum+= Integer.parseInt(number);
			}
			if(!negativeNumbers.equals(""))
				throw new Exception("no negative numbers " + negativeNumbers);
			return sum;
		}
		
	}
}
