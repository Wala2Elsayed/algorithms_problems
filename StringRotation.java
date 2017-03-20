// Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
// cracking the code interview

import java.util.Scanner;


public class StringRotation {
	
	public static boolean isRotation(String s1, String s2)
	{
		if(s1.length() == s2.length() && s1.length() > 0 && s2.length() > 0)
			return(isSubString(s1 + s1, s2));
		return false;
	}
	
	public static boolean isSubString(String s1, String s2)
	{
		return s1.contains(s2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		s.close();
		System.out.println(isRotation(s1, s2));

	}

}
