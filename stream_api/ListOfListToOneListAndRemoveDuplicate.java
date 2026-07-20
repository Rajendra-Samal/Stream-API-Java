package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListToOneListAndRemoveDuplicate {
    public static void main(String[] args) {
        List<List<Integer>> listOflist = Arrays.asList(
            Arrays.asList(1,2,3,4),
            Arrays.asList(2,3,1,6),
                Arrays.asList(4,5,6,7),
                Arrays.asList(1,3,5,6),
            Arrays.asList(4,7,8,9),
                Arrays.asList(5,4,3,2,6)
        );
        List<Integer> result = listOflist.stream()
                .flatMap(newList -> newList.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
//flatMap == collect more stream and give one stream