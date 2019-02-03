package in.swapnilsingh.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
//        stream.forEach(s -> System.out.println(s));

        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");
        Predicate<String> p4 = p2.or(p3);

        stream
                .filter(p4)
                .forEach(System.out::println);

    }

}