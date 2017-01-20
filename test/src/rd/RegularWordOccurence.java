package rd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularWordOccurence {

	public static void main(String[] args) {
		int count=0;
		Pattern p =Pattern.compile("ramesh");
		Matcher m =p.matcher("rameshrameshrameshramesh");
		while (m.find()) {			
			System.out.println(m.start());
			count++;
		}
		System.out.println("count : " +count);
	}
	
}
