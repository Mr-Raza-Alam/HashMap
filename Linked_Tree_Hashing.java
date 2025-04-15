import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Linked_Tree_Hashing {
// task :- implementation of all operation of hash-map using linkedHashMap 
public static void main(String[] args) {
 // linkedhashMap is similar as hashmap but here only one change i.e. the keys are arrange in inserted ordered using doubly ll
  LinkedHashMap<String,Double> lhm = new LinkedHashMap<>();
 // linkedhashMap is similar as hashmap but here only one change i.e. the keys are arrange in sorted ordered using Red Black tree -
  TreeMap<String,Double> tm =  new TreeMap<>();
 // mall-item price
 tm.put("T-Shirt", 450.67);
 tm.put("Watch", 570.79);
 tm.put("Sleeper", 630.55);
 tm.put("Shoes", 330.87);
 tm.put("Jeans", 960.75);
 Set<String> keys = tm.keySet(); 
 System.out.println("The items available in the mall are :- ");
 for(String k : keys){
    System.out.println(k + ", price : "+tm.get(k));
   }
   tm.remove("Sleeper");
   System.out.println(tm);
 }    
}
//  lhm.put("T-Shirt", 450.67);
//  lhm.put("Watch", 570.79);
//  lhm.put("Sleeper", 630.55);
//  lhm.put("Shoes", 330.87);
//  lhm.put("Jeans", 960.75);
//  Set<String> keys = lhm.keySet(); 
//  System.out.println("The items available in the mall are :- ");
//  for(String k : keys){
//     System.out.println(k + ", price : "+lhm.get(k));
//  }


