package stream_api;

import java.util.Arrays;
import java.util.List;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = number.stream()
                .filter(n -> n % 2 == 0)      // keep even numbers
                .mapToInt(Integer::intValue)  // convert to IntStream
                .sum();                         // compute sum

        System.out.println("Sum of even numbers: " + sum);
    }
}