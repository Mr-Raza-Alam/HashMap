import java.util.*;
public class ValidAnagram {
// task :- to return true if given 2 strings are anagram else return false using hashmap
static boolean isAnagram(String s,String t){//O(n) -> generally but in rarely most wrost case it will be O(n^2)
 if(s.length() == t.length()){
    // step-1 
 HashMap<Character,Integer> map = new HashMap<>();
   for(int i = 0; i<s.length(); i++){
    char ch = s.charAt(i);
    map.put(ch,map.getOrDefault(ch,0)+1);
   }
// step-2
 for(int i = 0; i<t.length(); i++){
    char ch = t.charAt(i);
    if(map.containsKey(ch)){
      if(map.get(ch) == 1) map.remove(ch);// freq.--
      else map.put(ch,map.get(ch)-1);// freq--
    } else{
      return false;
    }
   }
// step-3
if(map.isEmpty())  return true;
else return false;
 }
  return false;
}

//  leetcode-49 Group-Anagram
static void grpAnagrgam(String arr[]){
  // Map<K,V>
  HashMap<String,List<String>> map = new HashMap<>();
  for(int i = 0; i<arr.length; i++){//O(n)
     String str = arr[i];
    char [] chArr = str.toCharArray();// it will convert the str into a character array
    Arrays.sort(chArr); // O(llogl), l = size of chArr indirectly size of string str 
    String s2 = new String(chArr);// it will convert into a whole string
    if(map.containsKey(s2)){//O(1)
      // if same element is already present then add the curr str to list corresponding to key s2
      map.get(s2).add(str); // O(1)
    } else{
      map.put(s2,new ArrayList<String>()); //O(1)
      map.get(s2).add(str);//O(1)
    }
  }
  // print the map.value
  for(List<String> list : map.values()){// map.values() provide value of corresponding pair
     System.out.println(list);
  }
}
 public static void main(String[] args) {
  //List<List<String>> grp = new ArrayList<List<String>>();
  String strs[] = {"eat","tan","ate","nat","bat","tea"};
  System.out.println("The list of Anagram-group is");
  grpAnagrgam(strs);
 }
 
 static List<List<String>> groupAnagram(String arr[],List<List<String>> grp){
     for(int i = 0; i<arr.length; i++){
      List<String> list = new ArrayList<>();
      int j = arr.length - i;
      while (j>i){
        if(isAnagram(arr[i],arr[j])){//O(n)
          list.add(arr[j]);
        }
        j--;
      }
      if(list.size() !=0){
        list.add(arr[i]);
        grp.add(list);
      }
     }
    return grp;
 }

}
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter your 1st string : ");
  //   String s = sc.next();
  //   System.out.print("\nEnter your 2nd string : ");
  //   String t = sc.next();
  //  if(isAnagram(s, t)){
  //   System.out.println(s +" and "+t + " are Anagram");
  //  }else{
  //   System.out.println(s +" and "+t + " are not Anagram");
  //  }