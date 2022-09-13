package ArrayString;

import java.util.Scanner;

public class WordHowManyTimeIsOccuredString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Java is a programming Languag");
		System.out.println("");
		String exampleString = "Java is a programming Languag";

		System.out.println("Enter a Char to find in Sentence : ");
		char character=sc.next().charAt(0);
		char ch[]=exampleString.toCharArray();
		
		int count = 0;
		System.out.println(character +" is appears at index number");
		for(int i=0;i<ch.length;++i)
		{
			if(ch[i]==character)
			{
				count++;
				System.out.println(i+ " ");
			}
		}
		System.out.println("And it's Occured's "+count+" times in exampleString");
    }
}