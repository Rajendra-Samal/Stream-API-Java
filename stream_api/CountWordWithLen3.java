package stream_api;

import java.util.Arrays;
import java.util.List;

public class CountWordWithLen3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "java", "stream", "api");
        long count = words.stream()
                .filter(w -> w.length() > 3)
                .mapToInt(w -> w.length())
                .count();

        System.out.println("Count of words with length > 3: " + count);
    }
}
