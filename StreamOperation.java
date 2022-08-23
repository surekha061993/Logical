import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(1,2,2,4,3,5,5,6,6);
		
		  number.stream().distinct().forEach(System.out::println);
		 // number.stream().limit(2).forEach(System.out::println);
 		 
                 // number.stream().skip(4).forEach(System.out::println);
		 // number.stream().sorted().forEach(System.out::print);
		 // number.stream().distinct().count();
			
		number=number.stream().distinct().collect(Collectors.toList());
		System.out.println(number);
	}

}
