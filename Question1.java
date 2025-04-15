import java.util.*;
public class Question1 {
// Majority Element - > task :- find all elements that appear more than |_ size/3 _| times
static void majorityEle(int arr[],ArrayList<Integer> list){//O(n)
 HashMap<Integer,Integer> map = new HashMap<>();
  int n = arr.length;
  // step-1 
  for(int ele : arr){
  map.put(ele,map.getOrDefault(ele,0)+1);
  }
  /*
 this shorthand- map.put(ele,map.getOrDefault(ele,0)+1);
 if(map.containsKey(ele)){
  ele is already exit then only update its freq.
   map.put(ele,map.get(ele)+1);
 } else{
  add new unique ele with freq. = 1;
   map.put(ele,1);
 }   
   */  
 // step-2 -> iterate on map
//Set<Integer> keys = map.keySet();
for(Integer k : map.keySet()){
   if(map.get(k) > n/5){
    list.add(k);
   }
  System.out.println("Freq. of "+k+" = "+map.get(k));
  }
}
public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
 int num[] = {1,3,2,3,2,5,3,2,5,5,1,3,1,5,1};// here no.of 1's = 4, 3's = 4,5's = 4, 2's = 3 
 // expected o/p = 1, b/c only 1's has more than size/3 times
  majorityEle(num,list);
  System.out.println("Majority elements having freq. more than "+num.length/5+" are :- ");
 for(int i : list){
    System.out.print(i + " ");
 }
}
    
}
