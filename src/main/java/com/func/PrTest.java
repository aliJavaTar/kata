package com.func;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class PrTest {
    public static void main(String[] args) {


        List<Player> list = List.of(new Player("ali", 12),
                new Player("ali", 34),
                new Player("amin", 32),
                new Player("raha", 23));


        IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Player::countOfGolden));
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());


        Optional<Integer> collect1 = list.stream().map(Player::countOfGolden).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(collect1.get());

        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Player::countOfGolden).summaryStatistics();
//        Integer collect = (Integer) intSummaryStatistics;
//        System.out.println(collect);

        ToIntFunction<? super Player> toIntFunction = Player::countOfGolden;
        Double test = list.stream().collect(Collectors.averagingInt(toIntFunction));
        System.out.println(test);

        OptionalDouble average = list.stream().mapToInt(toIntFunction).average();

        System.out.println(average.getAsDouble());




    }
}

/*
//        Function<Integer, Integer> multiply = x -> x * 3;
//        Function<Integer, Integer> add = x -> x + 2 ;
//        Function<Integer, Integer> integerIntegerFunction = multiply.andThen(add);
//        System.out.println(integerIntegerFunction.apply(1));
//        Function<Integer, Integer> compose = multiply.compose(add);
//        System.out.println(compose.apply(1));
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

      Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
              .reduce((num1, num2) -> num1 + num2)
              .ifPresent(System.out::println);

      Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
               .reduce(1, (num1, num2) -> num1 + num2);
     System.out.println(reduce);

        String text = Stream.of("Hello", "World")
                .reduce("", (s1, s2) -> s1 + s2, (s1, s2) -> s1 + s2);

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
//        Map<String, Long> collect =
//                list.stream()
//                        .collect(Collectors.groupingBy(Player::name, Collectors.counting()));
//

//        collect.forEach((k, v) -> System.out.println(k + ": " + v));
//        collect.entrySet().forEach(System.out::println);

//        Spliterator
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

//        long count = Stream.of(new Player("ali", 23), new Player("gholam", 63)
//                        , new Player("reza", 7), new Player("amir", 456))
//                        .mapToInt();
//        var all = IntStream.range(0, 101).summaryStatistics();
//
//        System.out.println(all);
//        System.out.println(count);
//        var intSummaryStatistics = new IntSummaryStatistics();