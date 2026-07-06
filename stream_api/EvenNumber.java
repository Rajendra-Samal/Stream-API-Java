package stream_api;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        // filter all the even numbers
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 87, 34);

        number.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);  // method reference
    }
}