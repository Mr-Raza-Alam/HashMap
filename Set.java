import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Set {
    public static void main(String[] args) {
        HashSet<String> Cities = new HashSet<>();
        Cities.add("Patna");
        Cities.add("Hydarabad");
        Cities.add("Delhi");
        Cities.add("Mumbai");
        Cities.add("Wrangal");
        Cities.add("Silchar");
  // here we an interface for iteration on cities- set
  System.out.println("List of few cities of India are :- ");
  for(String city : Cities){// using Enhance iterator
    System.out.println(city);
  }
  LinkedHashSet<String> lhs = new LinkedHashSet<>();
  lhs.add("Patna");
  lhs.add("Hydarabad");
  lhs.add("Delhi");
  lhs.add("Mumbai");
  lhs.add("Wrangal");
  lhs.add("Silchar");
  System.out.println("List of few cities of India are in inserting order :- ");
  for(String city : lhs){// using Enhance iterator O(n), n = no. of unique items in the linkedhash-set
    System.out.println(city);
  }
  TreeSet<String> ts = new TreeSet<>();
  ts.add("Patna");
  ts.add("Hydarabad");
  ts.add("Delhi");
  ts.add("Mumbai");
  ts.add("Wrangal");
  ts.add("Silchar");
  System.out.println("List of few cities of India are in sorted order :- ");
  for(String city : ts){// using Enhance iterator O(n),n = no. of unique items in the tree-set
    System.out.println(city);
  }
 //   Iterator<String> it = Cities.iterator();// iterator() return a valid iterator
//   while(it.hasNext()){
//     // it.next() -> it print the value at it and it updated the it's value 
//     System.out.println(it.next());// here it print in random order
//   }

    }
}
    //     hs.add(6);// each add()--> O(1)
    //     hs.add(2);
    //     hs.add(8);
    //     hs.add(3);
    //     hs.add(6);
    //     System.out.println("The values store in the set are :-\n"+hs);// return an array of elements of type integer
    //    if(hs.contains(8)) System.out.println("Set contain ele. 8");
    //     if(hs.contains(9)) System.out.println("Set contain ele. 9");
    //     hs.clear();
    //     System.out.println("Size of set = "+hs.size());

