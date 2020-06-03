package largestNum;

public class LargestNumberFromArray implements GetsLargestNumber{

	@Override
	public int getLargestNum(int[] arrayOfIntegers) {
		
		int largest = arrayOfIntegers[0];
		for(int i=0;i<=arrayOfIntegers.length-1;i++) {
			if(largest<=arrayOfIntegers[i]) 
				largest=arrayOfIntegers[i];
		}
		return largest;

	}
	
}




