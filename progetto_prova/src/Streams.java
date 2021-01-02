import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args){

        //stream1();
        //stream2();
        create_stream();
    }

    static void stream1(){
        // Streams may or may not have a defined encounter order.
        // It depends on the source and the intermediate operations.
        Stream<String> s1 = Stream.of("Melania", "Enrico", "Stefano");
        Stream<Integer> s2 = Stream.of(12, 34, 55);

        System.out.println("elements with more than 6 chars in s1");
        s1.filter(x -> x.length() > 6).forEach(System.out::println);

        System.out.println("print of the elements in s2");
        s2.forEach(System.out::println);

        // s1.forEach(System.out::println); // ERROR: Traversable only once!
        // we may create another stream from the previous one and travers it...
        Stream<Integer> s3 = Stream.of(77, 5, 45);

        Stream<Integer> s4 = s3.filter(x -> x > 30);
        System.out.println("print of the elements in s4");
        s4.forEach(System.out::println);

        Stream<String> s5 = Stream.of("Melania", "Enrico", "Stefano", "Giulio");
        Stream<Integer> s6 = Stream.of(12, 34, 55);

        System.out.println("count function in s5");
        System.out.println(s5.count());

        /*
        doesn't work...
        List<Integer> list1 = s2.filter(x -> x > 30).filter(x -> x%2 == 0)
                .distinct().collect(Collectors.toList());
        System.out.println("print of the elements in list1");
        list1.forEach(System.out::println);
        */

        Stream<String> s7 = Stream.of("Mariapia", "Enrico", "Stefano");
        List<String> list1 = s7.filter(x -> x.length() > 2)
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println("elaborating stream 8");
        Stream<Integer> s8 = Stream.of(12, 34, 55);
        Optional<Integer> value = s8.filter(x -> x > 30)
                .filter(x -> x % 2== 0)
                .findFirst();
        value.ifPresent(System.out::println);
        // findFirst returns an Optional because might be the case in which
        // there are no one elements into the final stream

        System.out.println("elaborating stream 9");
        Stream<Integer> s9 = Stream.of(12, 34, 55);
        Optional<Integer> val = s9.filter(x -> x > 30)
                .filter(x -> x % 2 == 0)
                .findAny();
        val.ifPresent(System.out::println);

        /*
         * other final operators:
         * - boolean allMatch(condition) : true if all match the condition
         * - boolean anyMatch(condition) : true if at least one matches the condition
         * - boolean noneMatch(condition) : true if no one matches the condition
         * */
    }

    static void stream2 (){

        Stream<String> s1 = Stream.of("Mariapia", "Enrico", "Stefano");
        Stream<String> s2 = Stream.of("Mariapia", "Enrico", "Stefano");
        Stream<String> s3 = Stream.of("Mariapia", "Enrico", "Stefano");
        Stream<String> s4 = Stream.of("Mariapia", "Enrico", "Stefano");

        List<String> list1 = s1.map(String::toLowerCase) // to lowercase
                .collect(Collectors.toList());
        System.out.println(list1);

        List<Character> list2 = s2.map(x -> x.charAt(0)) // get first char
                .collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3 = s3.map(String::toLowerCase)
                .sorted().collect(Collectors.toList()); // alphabetic order
        System.out.println(list3);

        List<String> list4 = s4.map(String::toLowerCase)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(list4);
    }

    static void create_stream(){
        /*
        List<String> list1 = Arrays.asList("Stefano", "Mariapia", "Enrico");
        List<String> list2 = Arrays.asList("Pirlo", "Ciccio", "Franco");

        list1.stream().count();

        HashSet<String> set1= new HashSet<>();
        set1.stream().count();

        Stream s1 = Stream.empty(); // empty stream
        Stream s2 = Stream.of(list1, list2); // stream of lists

        s1.forEach(System.out::println);
        s2.forEach(System.out::println);

        // stream of numbers created from scratch with range and rangeclosed
        IntStream ints1 = IntStream.range(0, 10);
        System.out.println(ints1.filter(x -> x % 2 == 0).count());

        IntStream ints2 = IntStream.rangeClosed(0, 10);
        System.out.println(ints2.filter(x -> x % 2 == 0).count());

        // or created by other streams
        Stream<Integer> s3 = Stream.of(12, 34, 34, 55, 102);
        OptionalInt value = s3.mapToInt(x -> x + 1).min(); // attention, optional!
        value.ifPresent(System.out::println);
        */
        // other creation options...
        int[] a = {1, 2, 3};
        System.out.println(Arrays.stream(a).sum()); // sum a elements
        LongStream st1 = LongStream.iterate(2, x -> x * x);
        long[]b = st1.limit(5).toArray(); // apply st1 and take first 5
        Arrays.stream(b).forEach(System.out::println); // print
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
