package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonEleBetweenThem {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 6, 2);

        Set<Integer> set = new HashSet<>(list1);

        List<Integer> result = list2.stream()
                .filter(n -> set.contains(n))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}