package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find the odd number and return the square of the number
public class FindOddReturnSquares {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));

         List<Integer> result = list.stream()
                 .filter(elem -> elem % 2 != 0)
                 .map(elem -> elem*elem )
                 .toList();
        System.out.println(result);


    }
}
