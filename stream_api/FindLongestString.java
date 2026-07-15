package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rajendra", "Java", "SpringBoot");
        Optional<String> result = list.stream()
                .max(Comparator.comparing(n -> n.length()));

        if(result.isPresent()){
            System.out.println(result.get());
        }
    }
}
