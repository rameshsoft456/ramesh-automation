package strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String s="   ra me sh ";
		System.out.println(s.trim());
		//System.out.println(s.substring(3, 6));;
		System.out.println(s.replaceAll("\\s","").trim());;
		System.out.println(s.replaceAll("\\s+","").trim());;
		//\s = Anything that is a space character (including space, tab characters etc)
		//\S = Anything that isn't a space character (including both letters and numbers, as well as punctuation etc)
	}
	
}
