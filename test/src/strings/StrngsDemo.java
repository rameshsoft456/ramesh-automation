package strings;

public class StrngsDemo {

	public static void main(String[] args) {
		
		String s="ramesh";
		char[] c=s.toCharArray();
		/*System.out.println(s.charAt(2));
		System.out.println(s.substring(4));
		System.out.println(s.substring(2, 4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.compareTo("hello"));//returns some int number if not equal
		System.out.println(s.compareTo("ramesh"));//returns 0 if equal
		System.out.println(s.compareToIgnoreCase("hello"));
		System.out.println(s.compareToIgnoreCase(s.toUpperCase()));
		System.out.println(s.concat("sunitha"));
		
		System.out.println(s.contentEquals("RameSh"));//false		
		System.out.println(s.contentEquals("ramesh"));//true		
		System.out.println(s.codePointAt(0));*/
		System.out.println(s.endsWith("ra"));//false
		System.out.println(s.endsWith("sh"));//true
		System.out.println(s.startsWith("ra"));//true
		System.out.println(s.startsWith("sh"));//false
		System.out.println(s.split(""));
		
	}
	
}
