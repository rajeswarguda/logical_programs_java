package Logic;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseStringByWords {
	
	public static void main(String[] args) {
		
		String description = "Java technology blog for smart java concepts and coding practices";
		 
		// reverse string builder
		StringBuilder reverseString = new StringBuilder();
		 
		// Put words from String in Stack
		Stack<String> myStack = new Stack<>();
		 
		StringTokenizer tokenizer = new StringTokenizer(description, " ");
		 
		while (tokenizer.hasMoreTokens()) {
		    myStack.push(tokenizer.nextToken());
		}
		 
		//Pop each word from stack and append in builder
		 
		while (!myStack.empty()) {
		    reverseString.append(myStack.pop() + " ");
		}
		
		System.out.println(reverseString.toString());
		
	}

}
