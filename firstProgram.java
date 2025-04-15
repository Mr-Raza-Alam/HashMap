import java.util.HashMap;
import java.util.Set;
public class firstProgram {

// task:- implement put(key,value) fun. using hashmap
  public static void main(String[] args) {
  // Create a hashmap -> 
    HashMap<String,Integer> hm = new HashMap<>(); 
    // Insert - O(1)
 hm.put("India", 100);
 hm.put("England", 160);
 hm.put("Nepal",80);
 hm.put("Australia", 120);
 hm.put("Usa", 50);
 hm.put("China",   250);
// // iteration on hashmap through keySet()-method - O(1)
 Set<String> keys = hm.keySet();// here keySet() has created a set of keys of string type
 System.out.println(keys);// return in an String array[] in random order 
 for(String k : keys){
    System.out.println("(Key - "+k+", Value - "+hm.get(k)+")");
 }
 System.out.println(hm.entrySet());//[china = 250,india = 100,.....]
  }  
}
 // hash-map print the (key,value) pair in random order
// System.out.println("The value store in the hashmap\n"+hm);
// // Get- O(1)
//  int pop = hm.get("Australia");// return 120 
//  //int p = hm.get("Bhutan");// return null b/c it is not exit
//  System.out.println("Population of Aus = "+pop);
// // System.out.println("Population of Bhutan = "+p);
// // containKey() - O(1) return true, if key exit otherwise return false
// System.out.println(hm.containsKey("India"));
// System.out.println(hm.containsKey("Indonesia"));
// // Remove() -  O(1)
// System.out.println(hm.remove("China"));
// System.out.println(hm);
   