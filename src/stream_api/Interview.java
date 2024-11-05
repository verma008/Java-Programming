package stream_api;
//code to fetch element which startswith 'a' OR endswith 'a' using stream api

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("aaa","abc","cda","bab","cba");

        List<String> collect = str.stream().filter(a -> a.startsWith("a") || a.endsWith("a")).collect(Collectors.toList());
        System.out.println(collect);




    }
}
