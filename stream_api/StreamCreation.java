package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        ArrayList<String> listOfcity = new ArrayList<>();
        listOfcity.add("Dhenkanal");
        listOfcity.add("Hugli");
        listOfcity.add("Marathaka");
        listOfcity.add("Aswat");

        // Regular stream
        Stream<String> stream = listOfcity.stream();
        stream.forEach(System.out::println);

        // Parallel stream - CREATE NEW STREAM (can't reuse old one)
        Stream<String> parallelStream = listOfcity.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}