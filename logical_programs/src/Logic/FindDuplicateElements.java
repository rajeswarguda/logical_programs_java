package Logic;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,4,5,6,7,8,1,6};  //input 1
        int size = array.length;              //input 2
          
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();
           
        for(int i = 0; i < size ; i++)
        {
            if(set.add(array[i]) == false)
            {
                duplicates.add(array[i]);
            }
        }
          
        if(duplicates.size() == 0)
        {
            duplicates.add(-1);
        }
          
        System.out.println(duplicates);

	}

}
