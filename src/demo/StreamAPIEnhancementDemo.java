package demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEnhancementDemo {

	public static void main(String[] args) {
		
		Stream<Integer> mystream = Stream.of(1, 3, 5, 7, 9, 11, 13);
		mystream.dropWhile(num -> num < 9).forEach(num -> System.out.println(num));
		
		Stream<Integer> mystream1 = Stream.of(11, 22, 60, 1, 3, 40, 100);
		mystream1.dropWhile(num -> num < 40).forEach(num -> System.out.println(num));
		
		System.out.println("***************************************");
		Stream<Integer> mystream2 = Stream.of(1, 3, 5, 7, 9, 11, 13);
		mystream2.takeWhile(num -> num < 9).forEach(num -> System.out.println(num));
		
		Stream<Integer> mystream3 = Stream.of(11, 22, 60, 1, 3, 40, 100);
		mystream3.takeWhile(num -> num < 40).forEach(num -> System.out.println(num));
		
		IntStream.iterate(1, num -> num < 30, num -> num *3).forEach(num ->System.out.println(num));
		
		Stream<String> stream = Stream.ofNullable(null);
		stream.forEach(str -> System.out.println(str));
		
		Stream<String> stream1 = Stream.ofNullable("java");
		stream1.forEach(str -> System.out.println(str));
	}

}
