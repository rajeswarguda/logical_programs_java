package Logic;
import java.util.stream.LongStream;

public class Demo {
	
	public static void main(String[] args) {
		
		LongStream.rangeClosed(1, 15).forEach(System.out::println);
	}

}
