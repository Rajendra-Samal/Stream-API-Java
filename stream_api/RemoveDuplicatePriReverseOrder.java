package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatePriReverseOrder {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,6,2,5,4,8,1));

       List<Integer> result = list.stream()
               .distinct()
               .sorted(Comparator.reverseOrder())
               .toList();
        System.out.println(result);
    }
}
