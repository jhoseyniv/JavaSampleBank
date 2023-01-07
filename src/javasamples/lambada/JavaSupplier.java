package javasamples.lambada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Random;
import java.util.function.Supplier;

public class JavaSupplier {
    public static void main(String[] args){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
         LocalDateTime time = supplier.get();
         System.out.println(dateTimeFormatter.format(time));



        Supplier<Double> r = () -> Math.random();

        System.out.println("Random Value is :" + ((Supplier)() -> Math.random()).get());


        Supplier<Book> book1 = () -> new Book("Book1","Reza");
        System.out.println("Author of book1 is : "  + book1.get().getAuthor());

    }
}
