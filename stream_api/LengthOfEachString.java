package stream_api;

import java.util.Arrays;
import java.util.List;

public class LengthOfEachString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        words.stream()
                .map(s -> s.length())
                .forEach(len -> System.out.println("Length: " + len));
    }
}
