package interfaces;

public class Sample2 {

	// Default Methods
	
	public interface Interface1 {
		default void log(Integer i) {
			System.out.println(prefix() + i);
		}

		String prefix();
	}

	public interface Interface2 {
		default Integer max(Integer a, Integer b) {
			return Math.max(a, b);
		}
	}

	public static class BothInterfacesImpl implements Interface1, Interface2 {
		@Override
		public String prefix() {
			return "Maximo: ";
		}

		public void test(Integer a, Integer b) {
			Integer max = max(a, b);
			log(max);
		}
	}

	public static void main(String[] args) {
		new BothInterfacesImpl().test(1, 2);
	}
}
