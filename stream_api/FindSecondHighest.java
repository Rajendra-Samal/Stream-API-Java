package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,3,8,2,6,4,6);
        Optional<Integer> result = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(result.get());
        //if list like {6,6,6,6} then we check if(result.isPresent())
    }
}
