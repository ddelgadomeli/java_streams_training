package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sample9 {
	public static void main(String[] args) {
		
		// Parallel Streams
		List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");
		String[] chars = list.parallelStream()
				.peek(s -> System.out.println("Step 1: " + s))
				.peek(s -> randomSleep())
				.peek(s -> System.out.println("Step 2: " + s))
				.toArray(String[]::new);
		System.out.println("Chars: " + Arrays.toString(chars));
	}

	private static void randomSleep()  {
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
