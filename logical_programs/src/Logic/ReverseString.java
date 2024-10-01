package Logic;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String blogName = "HowToDoInJava.com";
		 
		String reverse = sbReverse(blogName);
		 
		System.out.println("Original String -> " + blogName);
		System.out.println("Reverse String -> " + reverse);
	}
	
	public static String sbReverse(String s) {
		
		return new StringBuilder(s).reverse().toString();
	}

}
