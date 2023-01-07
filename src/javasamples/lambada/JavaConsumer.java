package javasamples.lambada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaConsumer {
    public static void main(String[] args) {

        // Consumer to display a number
        Consumer<Integer> consumer = n -> System.out.println(n);
        consumer.accept(100);

        // Consumer to multiply 3 to every integer of a list
        List<Integer> numbers = Arrays.asList(10,12);
        numbers.forEach( n  -> System.out.println(n*3 ) );

        // Consumer to display a list of numbers
        numbers.forEach( n  -> System.out.println(n ) );

    }
}
