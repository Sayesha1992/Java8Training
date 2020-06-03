package bonustasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumbers {
	
	public List<Integer> sortInreverseOrderWithLambda(List<Integer> givenIntegerList){
		
		Collections.sort(givenIntegerList, (i,j) -> {
			if(i>j)
				return -1;
			else if(i<j)
				return 1;
			else
				return 0;
		});
		
		return givenIntegerList;
	
	}
	public List<Integer> sortInreverseOrderWithoutLambda(List<Integer> givenIntegerList){
		Collections.sort(givenIntegerList, Collections.reverseOrder());
		return givenIntegerList;
	
	}
}
