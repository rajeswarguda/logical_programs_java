package Logic;

public class StringPalindrome {

	public static void main(String[] args) {
		
		System.out.println( isPalindromeString("howtodoinjava") );
        System.out.println( isPalindromeString("abcba") );
        
        System.out.println( isPalindromeString1("howtodoinjava") );
        System.out.println( isPalindromeString1("abcba") );
        
        

	}
	
/*	public static boolean isPalindromeString(String originalString) 
    {
        String reverse = StringUtils.reverse(originalString);
        return originalString.equals(reverse);
    } */
	
	public static boolean isPalindromeString(String originalString) 
    {
        String reverse = new StringBuilder(originalString).reverse().toString();
        return originalString.equals(reverse);
    }
	
	public static boolean isPalindromeString1(String originalString) 
    {
        String reverse = "";
         
        int length = originalString.length();
         
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + originalString.charAt(i);
         
        return originalString.equals(reverse);
    }
	
	

}
