package functionalInterfacesOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterFruits {

	public static void main(String[] args) {
		
		Predicate<String> nameRule = (String str) ->{
			return str.startsWith("p");
		};
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("guava");
		fruits.add("pineapple");
		
		testNameCondition(nameRule,fruits );
		
	}

	private static void testNameCondition(Predicate<String> nameRule, ArrayList<String> fruits) {
		// TODO Auto-generated method stub
		for(String s: fruits) {
			if(nameRule.test(s))
				System.out.println(s);
			else
				System.out.println("sorry");
		}
	}

}
