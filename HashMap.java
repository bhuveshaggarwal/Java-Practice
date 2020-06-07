import java.util.HashMap; 
import java.util.Map; 
  
public class Main { 
    public static void main(String[] args) 
    { 
  
        HashMap<String, Integer> map = new HashMap<>(); 
  
        print(map); 
        map.put("Bhuvesh", 20); 
        map.put("Sakshi", 25); 
        map.put("Mohit", 30); 
  
        System.out.println("Size of map is:- " + map.size()); 
  
        print(map); 
        if (map.containsKey("Bhuvesh")) { 
            Integer a = map.get("Bhuvesh"); 
            System.out.println("value for key" + " \"Bhuvesh\" is:- " + a); 
        } 
         
         System.out.println("Iterating Hashmap.....");  
           for(Map.Entry m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
        
         System.out.println("Clearing Hashmap.....");
        map.clear(); 
        print(map); 
    } 
  
    public static void print(Map<String, Integer> map) 
    { 
        if (map.isEmpty()) { 
            System.out.println("map is empty"); 
        } 
  
        else { 
            System.out.println(map); 
        } 
    } 
} 