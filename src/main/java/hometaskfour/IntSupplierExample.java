package hometaskfour;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierExample {

	public int getRandomNumber() {
		IntSupplier randomNumberSupplier = ()->{
			return new Random().nextInt(500);
			
			};
		return randomNumberSupplier.getAsInt();
	}
}
