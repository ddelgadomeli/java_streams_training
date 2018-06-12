package interfaces;

public class Sample1 {
	
	// Static Methods
	
	public interface StaticSample {

		static String sayHi(String name) {
			return String.format("Hello %s!", name);
		}

	}

	public static void main(String[] args) {
		System.out.println(StaticSample.sayHi("Jon"));
	}
}
