package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Sample8 {
	public static void main(String[] args) {

		// FlatMap
			
		List<String> one = Arrays.asList("e", "b", "d");
		List<String> two = Arrays.asList("c", "a", "f");
		List<List<String>> combined = Arrays.asList(one, two);
	
		List<String> flatted = combined.stream()
		    .flatMap(Collection::stream)
		    .peek(s -> System.out.println("Step 1: " + s))
		    .map(String::toUpperCase)
		    .peek(s -> System.out.println("Step 2: " + s))
		    .sorted()
		    .peek(s -> System.out.println("Step 3: " + s))
		    .collect(Collectors.toList());
		System.out.println("flatted: " + flatted);
	}
}
