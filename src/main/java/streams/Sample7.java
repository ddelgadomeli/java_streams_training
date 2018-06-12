package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample7 {
	public static void main(String[] args) {
		
		// Collectors Example 2
		
		List<String> list = Arrays.asList("a", "bb", "ccc");
		
		String joined = list.stream()
		        .collect(Collectors.joining("<>", "Start: " , " :End"));
		System.out.println("joined: " + joined);

		Map<Boolean, List<String>> partitions = list.stream()
		 .collect(Collectors.partitioningBy(s -> s.length() > 2));
		System.out.println("partitions: " + partitions.toString());
	}
}
