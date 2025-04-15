package Trie;

public class UniqueSubstring {
// task :- count all possible unique substring of a given string;
static class Node{
    Node child[] = new Node[26];
    boolean eow = false;
    Node(){
     for(int i = 0; i<26; i++){
        child[i] = null;
     }
    }
 }
 static Node root = new Node();
 static int count = 1;
 // insert 
 static void insertNode(String word){
    Node curr = root;
    for(int i = 0; i<word.length(); i++){
      int idx = word.charAt(i) - 'a';
      if(curr.child[idx] == null){
        curr.child[idx] = new Node();
        count++;
      }
      curr = curr.child[idx];
    }
    curr.eow = true;
 }

 static int countNode(Node root){
    if(root == null){
        return 0;
    } 
    int t = 0; // t -> count
   for(int i = 0; i<26; i++){// loop is req. b/c each node of trie can have 26 childrens 
     if(root.child[i] != null){
       t += countNode(root.child[i]);
     }
   }
   return t+1;// similar as in BST (LCount +RCount +1(i.e itself))
 }

 static void countUniqueSubstring(String st){
  for(int i =0; i<st.length(); i++){
    // step-1 find all possible suffix of st
    String suffix = st.substring(i);
  // step-2 find all unique possible prefix of each suffix word using Trie's insert fuction
    insertNode(suffix);
  } 
  System.out.println("Count Unique Substring = "+ countNode(root));
 }

 public static void main(String[] args) {
    String str = "apple"; 
    countUniqueSubstring(str);
    System.out.println("\n count = "+count);
 }


}
