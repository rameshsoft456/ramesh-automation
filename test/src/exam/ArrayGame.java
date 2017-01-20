package exam;

import java.util.Arrays;

public class ArrayGame {
	public static void main(String[] args) 
	{		
		TestArray ag = new TestArray();
		System.out.println(ag.arrayIteration(new int[]{1,2,3,4,5}));
	}
}
class TestArray
{
	public long arrayIteration(int[] inputArray)
	{
		int lenGivenArr = inputArray.length;
		java.util.Arrays.sort(inputArray);		
		long iterationCount = 0;
		System.out.println(Arrays.toString(inputArray));
		
		boolean b=checkArrayEqual(inputArray);
				
		if(b==false)
		{
			for ( ; !checkArrayEqual(inputArray) ; ) {
				int j=0;
				for( ;j<lenGivenArr-1;)
				{
					inputArray[j] = inputArray[j] +  1;
					j++;
				}
				java.util.Arrays.sort(inputArray);	
				Arrays.toString(inputArray);;	
				iterationCount = iterationCount + 1;
			}
		}
		return iterationCount;
	}
	
	public static boolean checkArrayEqual(int[] array) {
	    if (array.length == 0) {
	        return true;
	    } else {
	        int first = array[0];
	        for (int element : array) {
	            if (element != first) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
	
}