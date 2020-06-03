package hometaskfour;

import java.util.function.IntConsumer;

public class IntConsumerExample {

	public void squareANumber(int number) {
		IntConsumer squareTheNumber = (givenNumber)->{
			System.out.println("Square of "+givenNumber+" is "+Math.pow(givenNumber, 2));
			};
			squareTheNumber.accept(number);
	}
}

