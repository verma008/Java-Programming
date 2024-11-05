/*write a java method that takes a list of strings and returns a Map where each
string is a key and its value is the number of times it appears in the list. */
package collection_framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCount {

    public Map<String,Integer> stringCount(List<String> list){
        Map<String,Integer> map=new HashMap<>();
        for(String str: list){
            if(map.containsKey(str)) {
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("aman","archana","aman","archana","aarika","abhinav");
        StringCount s=new StringCount();
        Map<String,Integer> result=s.stringCount(list);
        System.out.println("String Occurrences: "+result);
    }
}
