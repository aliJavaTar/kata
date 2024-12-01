package com.func;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> doubleConsumer = number -> System.out.println("Doubled value: " + (number * 2));
        Consumer<Integer> printConsumer = number -> System.out.println("Original value: " + number);
        Consumer<Integer> combinedConsumer = printConsumer.andThen(doubleConsumer);
        numbers.forEach(combinedConsumer);
//        Function

        //primitive function
        /*
         IntToLongFunction
         IntToDoubleFunction
         ------------------
         LongToIntFunction
         LongToDoubleFunction
         ---------------
         DoubleToLongFunction
         DoubleToIntFunction
         -----------------------------------------------
         IntFunction
         LongFunction
         DoubleFunction
         -----------------------------------------------
         toIntFunction
         ToDoubleFunction
         ToLongFunction
         -----------------------------------------------
         Function
         */
        /*
        BiFunction
        ToDoubleBiFunction
        ToLongBiFunction
        ToIntBiFunction
         */
        /*
        supplier
        IntSupplier
        BooleanSupplier
        LongSupplier
        DoubleSupplier

         */
        /*
        Consumer
        BiConsumer
        LongConsumer
        IntConsumer
        DoubleConsumer
         */


//        Player t = new Player("", 33);
//        Predicate<Player> predicate = player -> player.countOfGolden() > 0;
//        out.println(Predicate.not(predicate).test(t));

    }

//    private static Supplier<Integer> convert(int number) {
//        return () -> Math.abs(number);
//    }

//    private static Function<Integer, String> convert(final String name) {
//        return number -> (name + number);
//    }
}
