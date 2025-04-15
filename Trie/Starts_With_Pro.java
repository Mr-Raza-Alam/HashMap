package Trie;

public class Starts_With_Pro {
 // task :- return true if for the given prefix word there exit a word in the trie that has the same prefix
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
 // insert 
 static void insertNode(String word){
    Node curr = root;
    for(int i = 0; i<word.length(); i++){
      int idx = word.charAt(i) - 'a';
      if(curr.child[idx] == null){
        curr.child[idx] = new Node();
      }
      curr = curr.child[idx];
    }
    curr.eow = true;
 }
 // startsWith(String prefix)
 static boolean startsWith(String prefix){//O(L) ,L = length of prefix word
    Node curr = root;
    for(int i= 0; i<prefix.length(); i++){
        int idx = prefix.charAt(i) - 'a';
      if(curr.child[idx] == null){
          return false;
      }
      // Level updation
      curr = curr.child[idx];
    }
    return true;
 }
 public static void main(String[] args) {
    String words[] = {"apple","app","mango","man","women"};
    // build a trie
     for(String k : words){
        insertNode(k);
     }
    String prefix = "moon";
    
    if(startsWith(prefix)){
        System.out.println(prefix+" :- is prefix word that exit in a particular word of dictionary");
    } else{
        System.out.println(prefix+" :- is prefix word that not exit in the dictionary's word");
    }
 }   
}
