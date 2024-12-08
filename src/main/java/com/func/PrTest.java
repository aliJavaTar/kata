package com.func;

import java.util.function.Function;

public class PrTest {
    public static void main(String[] args) {

        Function<Integer, Integer> multiply = x -> x * 3;
        Function<Integer, Integer> add = x -> x + 2 ;
        Function<Integer, Integer> integerIntegerFunction = multiply.andThen(add);
        System.out.println(integerIntegerFunction.apply(1));
        Function<Integer, Integer> compose = multiply.compose(add);
        System.out.println(compose.apply(1));

    }
}


record Person(String name) {
}

//       UnaryOperator;
//        BinaryOperator;
//        mapper(number -> number * 2, List.of(1, 2, 3, 4)).forEach(System.out::println);
//        FucGeneric<String, Integer> test = text -> text.length();
//        System.out.println(test.execute("ali"));
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        Consumer<Integer> doubleConsumer = number -> System.out.println("Doubled value: " + (number * 2));
//        Consumer<Integer> printConsumer = number -> System.out.println("Original value: " + number);
//        Consumer<Integer> combinedConsumer = printConsumer.andThen(doubleConsumer);
//        numbers.forEach(combinedConsumer);
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
        UnaryOperator
        ToDoubleUnaryOperator
        ToLongUnaryOperator
        ToIntUnaryOperator
         */
        /*
        Predicate
        ToDoublePredicate
        ToLongPredicate
        ToIntPredicate
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
//    }
//    private static <T> List<T> mapper(UnaryOperator<Integer> operator, List<Integer> numbers) {
//        List<Integer> number = new ArrayList<>();
//        for (Integer i : numbers) {
//            number.add(operator.apply(i));
//        }
//        return (List<T>) number;
//    }
//
//    private static List<String> filterList(List<String> strings, Predicate<String> pri) {
//        ArrayList<String> newString = new ArrayList<>();
//
//        for (String string : strings) {
//            if (pri.test(string))
//                newString.add(string);
//        }
//        return newString;
//    }
//    private static Supplier<Integer> convert(int number) {
//        return () -> Math.abs(number);
//    }
//    private static Function<Integer, String> convert(final String name) {
//        return number -> (name + number);
//    }