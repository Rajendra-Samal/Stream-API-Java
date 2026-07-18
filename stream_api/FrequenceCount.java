package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FrequenceCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,6,7,1,2,5,4,8,5,4,3,2);

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(n -> n,
                        Collectors.counting()));
        System.out.println(result);
    }
}
