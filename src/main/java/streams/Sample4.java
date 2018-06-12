package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Sample4 {
	public static void main(String[] args) {
		
		// Evens
		System.out.println("Evens:");
		Integer[] nums = { 1, 2, 3, 4, 5, 6 };
		Integer[] evens = Stream.of(nums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evens));

		
		
		// Map
		System.out.println("Squares:");
		Double[] nums2 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Double[] squares = Stream.of(nums2).map(n -> n * n).toArray(Double[]::new);
		System.out.println(Arrays.toString(squares));

		
		
		// Full Example
		System.out.println("Full Example:");
		List<String> list = Arrays.asList("a", "b ", null, "    c");
		String[] chars = list.stream()
				.peek(s -> System.out.println("Step 1: " + s))
				.filter(Objects::nonNull)
				.peek(s -> System.out.println("Step 2: " + s))
				.map(String::trim)
				.peek(s -> System.out.println("Step 3: " + s))
				.toArray(String[]::new);
		System.out.println("Chars: " + Arrays.toString(chars));
	}
}
