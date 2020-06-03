package hometaskfour;

import java.util.function.IntPredicate;

public class IntPredicateExample {
	public boolean checkNumberIsPrime(int number) {

			IntPredicate isPrimeCondition = (givenNumber)->{
				boolean flag = true;
					for(int i=2;i<givenNumber;i++) { 
						if(givenNumber%i==0)
							flag=false;
					}
					return flag;
				};
			return isPrimeCondition.test(number);
		}
		
}
