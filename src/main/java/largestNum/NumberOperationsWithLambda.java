package largestNum;

public class NumberOperationsWithLambda {

	public int getLargestNumFromArray(int[] inputArray) {
		GetsLargestNumber getsLargestNumber = (array)  -> {
			int largest = array[0];
			for(int i=0;i<=array.length-1;i++) {
				if(largest<=array[i]) 
					largest=array[i];
			}
			return largest;
		};
		
		return getsLargestNumber.getLargestNum(inputArray);
		
	}
	
	public int getSecondLargestNumFromArray(int[] inputArray) {
		GetsSecondLargestNum getsSecondLargestNum = (array)  -> {
			int temp = 0;
			for (int i = 0; i < array.length-1; i++){  
	            for (int j = i + 1; j < array.length-1; j++){  
	                if (array[i] > array[j])   
	                {  
	                    temp = array[i];  
	                    array[i] = array[j];  
	                    array[j] = temp;  
	                }  
	            }  
	        }
			return array[array.length-3];
		};
		
		return getsSecondLargestNum.getSecondLargestNum(inputArray);
		
	}
	
	
	
}
