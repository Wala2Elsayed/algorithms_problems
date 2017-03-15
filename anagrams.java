/* This is a solution for detecting anagrams (https://www.hackerrank.com/challenges/java-anagrams?h_r=internal-search) */

/* by comparing letters counts of each string */
static boolean isAnagram(String a, String b) {
  int[] chars = new int[256];
  for(int i =0; i < chars.length; i++)
  chars[i] = 0;
  a = a.toLowerCase();
  b = b.toLowerCase();
  for(int i =0; i < a.length(); i++)
  {
    chars[(int)a.charAt(i)]++;
  }
  for(int i =0; i < b.length(); i++)
  {
    chars[(int)b.charAt(i)]--;
  }
  for(int i =0; i < chars.length; i++)
  {
    if(chars[i] !=  0)
      return false;
  }
  return true;
}
        
/* by sorting strings and then comparing them */
static boolean isAnagram(String a, String b) {
  char[] a_array = a.toLowerCase().toCharArray();        
  char[] b_array = b.toLowerCase().toCharArray();
  Arrays.sort(a_array);
  Arrays.sort(b_array);
  return Arrays.equals(a_array, b_array);
}                           
