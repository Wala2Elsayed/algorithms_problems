import java.util.Scanner;


public class UniqueString {
	
	public static boolean isUnique(String str)
	{
		str.toLowerCase();
		boolean[] chars = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
			if(chars[(int)str.charAt(i)])
				return false;
			else
				chars[(int)str.charAt(i)] = true;
		}		
		return true;
	}
	
	public static boolean isUniqueWithoutExtraSpace(String str)
	{
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}		
		return true;
	}
	
	public static boolean isUniqueBitOperations(String str)
	{
		// assume str consists only of chars from a to z
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}		
		return true;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		System.out.println(isUnique(input));
		System.out.println(isUniqueWithoutExtraSpace(input));
		System.out.println(isUniqueBitOperations(input));

	}

}
