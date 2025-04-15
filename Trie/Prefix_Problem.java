package Trie;
public class Prefix_Problem {
  static class Node{ // node with its freq.
    Node child[] = new Node[26];
    boolean eow = false;
    int freq; 
    Node(){
     for(int i =0; i<26; i++){
        child[i] = null;
     }
     freq = 1;
    }
  }
  static Node root = new Node();
  static void insertNode(String word){
// step-1 create a currNode 
    Node curr = root;
   // step-2 traverse the string 
   for(int lev = 0; lev<word.length(); lev++){
     int idx = word.charAt(lev) - 'a';
     if(curr.child[idx] == null){
        // insert new node
        curr.child[idx] = new Node();
     } else {
        // increase freq.of letter by 1 unit
        curr.child[idx].freq++;
     }
     // update 
     curr = curr.child[idx];
   }
   curr.eow = true;
 }

 // search  O(L)
 static void findPrefix(Node root,String ans){//  O(L) L = level of word
  if(root == null) return;
  if(root.freq == 1) {
     System.out.print("'"+ans+"', ");
     return;
  }
    
  for(int i = 0; i<26; i++){//O(1)
    if(root.child[i] != null){
       findPrefix(root.child[i], ans+(char)(i +'a'));//O(L),l = length of longest word
      }
    }

 }
 public static void main(String[] args) {
  String arr[] = {"zebra","dog","duck","dove"};  
   // build a Trie
   for(String k: arr) {
    insertNode(k);
   }   
   root.freq = -1;
   System.out.println("The list of shortest unique prefix are :- ");
   findPrefix(root,"");

}

}
