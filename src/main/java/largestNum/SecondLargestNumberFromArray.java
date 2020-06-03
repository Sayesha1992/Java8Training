package largestNum;

public class SecondLargestNumberFromArray implements GetsSecondLargestNum{

	@Override
	public int getSecondLargestNum(int[] arrayOfIntegers) {
		
		int temp = 0;
		for (int i = 0; i < arrayOfIntegers.length-1; i++){  
            for (int j = i + 1; j < arrayOfIntegers.length-1; j++){  
                if (arrayOfIntegers[i] > arrayOfIntegers[j])   
                {  
                    temp = arrayOfIntegers[i];  
                    arrayOfIntegers[i] = arrayOfIntegers[j];  
                    arrayOfIntegers[j] = temp;  
                }  
            }  
        }
		return arrayOfIntegers[arrayOfIntegers.length-3];

	}
	
}




