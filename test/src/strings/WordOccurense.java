package strings;

public class WordOccurense {

	
	private static int countingWord(String value, String findWord)
    {		
        int counter = 0;
          while (value.contains(findWord))
        {
            int index = value.indexOf(findWord);
             System.out.println("index : " +index);
             value = value.substring(index + findWord.length(), value.length());
            counter++;
        }
        return counter;
    }
	
	public static void main(String[] args) {
				
		System.out.println(countingWord("1ramesh123rameshrameshramesh","ramesh"));
		
	}
	
}
