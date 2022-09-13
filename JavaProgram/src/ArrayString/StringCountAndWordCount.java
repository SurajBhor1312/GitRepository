package ArrayString;

public class StringCountAndWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String exampleString = "Java is a programming Language";

		        long totalCharacters = exampleString.chars().count();    //if we not required space then filter(ch -> ch != ' ') we can use that one

		        System.out.println("There are total " + totalCharacters + " characters in exampleString");
		       
	}

}

