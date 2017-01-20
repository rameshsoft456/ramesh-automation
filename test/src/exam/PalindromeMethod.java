package exam;

public class PalindromeMethod {

	public int increment(String pattern)
	{
	    boolean isPalindrome = false;
	    int i=0,j=pattern.length()-1;
	    int mismatchCounter = 0;

	    while(i<=j)
	    {
	        //reverse matching
	        if(pattern.charAt(i)== pattern.charAt(j))
	            {
	                i++; j--; 
	                isPalindrome = true;
	                continue;
	            }

	        else if(pattern.charAt(i)!= pattern.charAt(j))
	            {
	                i++;
	                mismatchCounter++;
	            }

	    }	    
	    return mismatchCounter;
	}
	public int decrement(String pattern)
	{
	 
	    boolean isPalindrome = false;
	    int i=0,j=pattern.length()-1;
	    int mismatchCounter = 0;

	    while(j>=i)
	    {
	        //reverse matching
	        if(pattern.charAt(i)== pattern.charAt(j))
	            {
	                i++; j--; 
	                isPalindrome = true;
	                continue;
	            }

	        else if(pattern.charAt(i)!= pattern.charAt(j))
	            {
	                j--;
	                mismatchCounter++;
	            }


	    }
	    return mismatchCounter;

	}	
	
	public int getIndex(String pattern)
	{
		return (increment(pattern)>decrement(pattern))?decrement(pattern):increment(pattern);
		
	}

	public static void main(String[] args) {

		PalindromeMethod pm = new PalindromeMethod();
		System.out.println(pm.getIndex("hello"));
	}
	
}
