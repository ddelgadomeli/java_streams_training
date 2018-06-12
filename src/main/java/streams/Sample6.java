package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample6 {
	public static void main(String[] args) {
		
		// Collectors Example 1

		List<String> list = Arrays.asList("X", "a", "b", "c", null, "a", "b", "c");
		
		List<String> filteredList = list.stream()
		        .skip(1)
		        .filter(Objects::nonNull)
		        .distinct()
		        .collect(Collectors.toList());
		System.out.println("filteredList: " + filteredList.toString());
		
		Map<String, Long> countMap = list.stream()
		        .filter(Objects::nonNull)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countMap: " + countMap.toString());
	}
}
