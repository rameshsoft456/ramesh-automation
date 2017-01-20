package exam;

public class MergeDemo1 {
	

	public static String merge(String s1,String s2)
	{ 
		int i=0;
		int j=0;
		String mergeString="";
		while(i<s1.length()&&j<s2.length())
		{			
			mergeString=mergeString+s1.charAt(i)+s2.charAt(j);
			
			i++;
		j++;
		}
		
		while(i>s1.length()||j<s2.length())
	     { 			
			mergeString=mergeString+s2.charAt(j);
			
			j++;
			
		}			
		while(j>s2.length()||i<s1.length())
		{ 			
			mergeString=mergeString+s1.charAt(i);
			
			i++;
			
		}
		
		//System.out.println("Merging of both "+s1+" and "+s2+" is: "+mergeString);
	
	return mergeString;


}
	
	public static void main(String[] args) {
		merge("AAAAAAAAAAAAAAAAAAAAA", "BBBBB");
		System.out.println(merge("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "BBBBB"));
		/*merge("XXXX", "111111");
		merge("CCCCCC", "DD");
		merge("EEEE", "FFFF");
		merge("GGGGGG", "A");
		merge("", "VVV");
		merge("BBB", "");*/
		//merge(null, null);//RE:NPE
	}
}
