import java.util.HashSet;
import java.util.HashMap;
public class Questions {
// ques.1 -> Count Distinct Elements
// ques.2 -> Union & Intersection
// ques.3 -> find Itinerary for tickets
// ques.4 -> largest subarray with 0 sum -> using the concept of preSum and hash-map

static int largestSubarray(int arr[]){//O(n)
  HashMap<Integer,Integer> map = new HashMap<>(); 
  int len = 0,sum = 0; // where len = length of subarray whose elements's sum = 0 

 for(int j = 0 ;j<arr.length; j++){
    sum +=arr[j];
     if(map.containsKey(sum)){
   // find the length of subarray,using j-idx => j-(curr.idx of sum) - idx(exiting idx of sum)
      len = Math.max(len,j - map.get(sum)); 
    } else{// if sum is not exit in the map then insert the sum,j into it
       map.put(sum,j);
    }
  }  
  return len;
}
public static void main(String[] args) {
  int arr[] = {15,-8,1,3,-4,-7,7,10};
  System.out.println("The largest length of subarray whose elements sum is 0 = "+largestSubarray(arr));
 }    
 static int distinctEle(int num[]){
    HashSet<Integer> SetEle = new HashSet<>();
     // step-1 :- store all items of num[] into SetEle
    for(int i : num){
       SetEle.add(i);
    }
    // step-2:- apply loop on SetEle and increment cout by 1 unit
    // OR return directly setEle.size();
    return SetEle.size();
   }
   static String startPoint(HashMap<String,String> tickets){
    // reverse hashmap 
      HashMap<String,String> revMap = new HashMap<>();
    for(String key : tickets.keySet()){
      revMap.put(tickets.get(key) , key);
    }
  // for start-point
  for(String key : tickets.keySet()) {
      if(!revMap.containsKey(key)){
          return key;// this will be start point
      }
   }
   return null;
  }
  
}
//int num[] = {4,5,3,6,2,8,4,6,2,9,10,4};
//  System.out.println("Total no. of unique elements are in num[] array = "+distinctEle(num));

//  HashSet<Integer> set = new HashSet<>();
//   int arr[] = {3,9,7};
//   int brr[] = {4,6,7,8,12,3};
// //for union
//   for(int k : arr) set.add(k);
//   for(int p : brr) set.add(p); 
// System.out.println("Arr U Brr is given \n"+set+"\nTotal no. of elements in a U b = "+set.size());
// set.clear();
// System.out.println("Size of set = "+set.size());    
// // for intersection
// int count = 0;
// System.out.println("A intersection B , the elements are :- ");
// for(int i : arr) set.add(i);
// for(int j : brr){
//  if(set.contains(j)){
//   count++;
//   System.out.print(j + " ");
//   set.remove(j);
// }
// }
//  System.out.println("\nTotal no. of eles in a !U b = "+count);
// System.out.println("Size of set = "+set.size());    

// itinerary means journey --> from city1->city2->city3->city4...(i.e start to end)
//  HashMap<String,String> tickets = new HashMap<>();
//  int count = 0;
//  tickets.put("Chennai","Bengalore");
//  tickets.put("Mumbai","Tamil-Naidu");
//  tickets.put("Tamil-Naidu","Goa");  
//  tickets.put("Goa","Chennai");
//  tickets.put("Bengalore","Delhi");
//  tickets.put("Delhi","Sri-Nagar");
//  System.out.println("Journey start from  :- "); 
//  // step-1 find start-point
//   String start = startPoint(tickets);
//   System.out.print(start); 
//    for(String key : tickets.keySet()){
//     System.out.print("-->"+tickets.get(start));
//     // updated start 
//     start = tickets.get(start);
//     count++;
//    }
//    System.out.println("\nTotal no. of tickets required for itienrary trip = "+count); 