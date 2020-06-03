package functionalInterfacesOfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterGivenFruits {
	
	static Predicate<Fruits> onName = (fruit) -> {
		return fruit.getName().contains("p");		
	};
	
	static Predicate<Fruits> onPrice = (fruit) -> {
		return fruit.getPrice() >= 10;
	};
	
	
	static Predicate<Fruits> onNamePrice= onName.and(onPrice);

	
	public static void checkPriceAndName(List<Fruits> fruits) {
		
		for(Fruits f : fruits) {
			if (onNamePrice.test(f))
				System.out.println(f);
		}
	}
	
	
	
	
}
