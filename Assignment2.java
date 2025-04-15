import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
public class Assignment2 {
 // task :- to find 2 such ele. in the given arr whose sum = target(given by user)
 // assignment -question-3 sorted by freq. 
 static String sortByFreq(String s,StringBuilder sb){//O(nlogk),where k = no.of unique eles. in the string
  TreeMap<Character,Integer> map = new TreeMap<>();
  // step-1 store all character in TreeMap
   for(int i = 0; i<s.length(); i++){// O(nlogk)
      char ch = s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);// each time it takes O(logk),k = no. of data in the map
   }
   // step -2 iteration on map
   for(Character k : map.keySet()){//O(k), k = no.of data in the map
     int t = map.get(k);
     while (t!=0){
        sb.append(k);
        t--;
     }
   }
   return sb.toString();
 }

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter the target value = ");
    int k = sc.nextInt();
    int num[] = {4,5,-2,7};
    System.out.print("Such 2 indices are = ");
    getTwoIndices(num, k);

//    String s = "cccaaa";
//    System.out.println("After sorting by its freq. = "+sortByFreq(s,new StringBuilder()));
}
 static void getTwoIndices(int arr[],int k){
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int j = 0; j<arr.length; j++){
       int curr = arr[j];
  
   if(map.containsKey(k-curr)){  
    System.out.print("["+map.get(k-curr)+", "+j+"]");
      return;
  } 
    map.put(curr,j);
  }
 }

}
