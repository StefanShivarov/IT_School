package tema8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class GuessTheCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Map<String, String>  countryToCapitalMap = new HashMap<String, String>(){{
			
			put("Bulgaria", "Sofia");
			put("France", "Paris");
			put("Italy", "Rome");
			put("England", "London");
			put("Greece", "Athens");
			put("Switzerland", "Bern");
			put("Norway", "Oslo");

		}};
		
		int points = 0;
		List<String> countries = new ArrayList(countryToCapitalMap.keySet());
		Collections.shuffle(countries);
		for(String country : countries) {
			
			System.out.println("What is the capital of "+country+"?");
			String capital = sc.nextLine();
			if(capital.equals(countryToCapitalMap.get(country))) {
				points++;
			}else {
				points--;
			}
		}
		
		System.out.println("Your points are: "+points+"!");

	}

}
