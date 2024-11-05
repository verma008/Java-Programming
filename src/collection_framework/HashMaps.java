/* HashMap: {key,value} key should be unique. Unordered map */

package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMaps{
    public static void main(String[] args) {

//create HashMap 	
        HashMap<Integer,String> map=new HashMap<>();  
        
// insertion        
        map.put(1,"Archana");
        map.put(2,"Anshika");
        map.put(3,"Abhinav");
        map.put(4,"Preeti");
        System.out.println(map);
        
        map.put(4, "Aman");
        System.out.println(map);

// Searching
        if(map.containsKey(4))
        {
        	System.out.println("Key is present in the map");
        }else {
        	System.out.println("Key is not present in the map");
        }
        
        System.out.println(map.containsKey(4)); // true
        System.out.println(map.containsKey(5)); // false
        
// map.get(key) if key is persent, print value of that key otherwise return null        
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        
        
// iteration        
        //for(int val:arr)
        for(Map.Entry<Integer,String> e: map.entrySet())
        {
        	System.out.println(e.getKey());
        	System.out.println(e.getValue());
        }
        
        Set<Integer> keys=map.keySet();
        for(Integer key: keys)
        {
        	System.out.println(key+ " "+ map.get(key));
        }
        	
   
// Delete : remove(key) it will delete key and value of this key(3)        
        map.remove(3);
        System.out.println(map); 
        

// print all the key        
        for(Integer i:map.keySet())
        {
            System.out.println(i);  
        }

// print all the values        
        for(String s:map.values())
        {
            System.out.println(s);   
        }
 
// isEmpty() Return true if map is empty otherwise return false       
       System.out.println(map.isEmpty());  
       
       
// The data will be displayed in the sorted form of key.  Map+BST
        //{1=Archana, 2=Anshika, 3=Abhinav, 4=Preeti, 5=verma}
        Map<Integer,String> m=new TreeMap<>();  
        m.put(5,"verma");
        m.put(2,"Anshika");
        m.put(3,"Abhinav");
        m.put(1,"Archana");
        m.put(4,"Preeti");
        System.out.println(m);
        
    }
}
