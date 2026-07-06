package stream_api;

import java.util.List;

public class NotConDuplicate {
    public static void main(String[] args) {
        //retrive all the names which start from R and it should not contain duplicate
        List<String> listOfName = List.of("Raja", "Raka", "Sita","Raja", "Hari", "Situ", "Rakesh", "Depa");

         listOfName.stream()
                 .filter(name -> name.startsWith("R")).distinct()
                 .forEach(System.out::println);
    }
}