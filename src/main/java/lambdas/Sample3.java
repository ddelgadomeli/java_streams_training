package lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Sample3 {
	public static void main(String[] args) {

		Consumer<String> cons = s -> System.out.println(s);
		cons.accept("Hola desde un Consumer!");
		
		Supplier<String> supp = () -> "Hola desde un Supplier!";
		System.out.println(supp.get());

		Function<String, String> func = s -> s.toUpperCase();
		System.out.println(func.apply("hola"));

		BiFunction<String, String, String> biFunc = (a, b) -> a.toUpperCase()+ " " + b;
		System.out.println(biFunc.apply("hola", "mundo"));
		
		//Referencias a métodos
		Consumer<String> cons2 = System.out::println;
		cons2.accept("Hola desde un Consumer 2!");
		
		Function<String, String> func2 = String::toUpperCase;
		System.out.println(func2.apply("hola 2"));
	}
}
