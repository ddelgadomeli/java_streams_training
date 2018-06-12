package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sample5 {
	public static void main(String[] args) {
		
		// Find
		List<String> list = Arrays.asList("a", "b", "c");

		Optional<String> firstElement = list.stream().filter("a"::equals).findFirst();

		String result = firstElement.orElse(null);
		System.out.println("found: " + result);

		
		// Match
		boolean anyMatch = list.stream().anyMatch("a"::equals);
		System.out.println("anyMatch: " + anyMatch);

		boolean noneMatch = list.stream().noneMatch("a"::equals);
		System.out.println("noneMatch: " + noneMatch);

		boolean allMatch = list.stream().allMatch("a"::equals);
		System.out.println("allMatch: " + allMatch);

	}
}
