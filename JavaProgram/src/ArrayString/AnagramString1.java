/*
 * package ArrayString;
 * 
 * import java.util.Arrays; import java.util.Scanner;
 * 
 * public class AnagramString1 { public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the First String : "); String str1 = sc.nextLine();
 * 
 * System.out.println("Enter the second String : "); String str2 =
 * sc.nextLine();
 * 
 * if(checkAnagram(str1, str2))
 * System.out.println(str1+" and "+str2+" are Anagrams"); else
 * System.out.println(str1+" and "+str2+" are NOT Anagrams");
 * 
 * sc.close(); }
 * 
 * private static boolean checkAnagram(String str1, String str2) { return false;
 * Arrays.sort(str1); Arrays.sort(str2);
 * 
 * return (Arrays.equals(str1, str2));
 * 
 * } }
 */