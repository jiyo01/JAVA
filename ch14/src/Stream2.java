import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,1,5,4,2);
		List<Integer> sortedList = list.stream().sorted()
									.collect(Collectors.toList());
		
		System.out.println(list);        //[3, 1, 5, 4, 2]
		System.out.println(sortedList);  //[1, 2, 3, 4, 5]
	}
}


