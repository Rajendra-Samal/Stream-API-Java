package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindSecondAndThirdElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,5,7,8,4);
        List<Integer> result = list.stream()
                .skip(1)
                .limit(2)
                .toList();
        System.out.println(result);
    }
}
