package com.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaAPI_3rd {
	@SuppressWarnings("removal")
	public static void main(String[] args) {

	Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));//supplier API
	System.out.println("supplier API");

	Consumer<Integer> consumer = (value) -> System.out.println(value);//cousumer API
	System.out.println("consumer API");

	Predicate predicate = (value) -> value != null;//predicate API
	System.out.println("predicate API");

	Function<Long, Long> adder = (value) -> value + 3;//Function API
	
	Long resultLambda = adder.apply((long) 8);
	System.out.println("resultLambda Function API = " + resultLambda);

	}

}
