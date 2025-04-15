package Trie;

public class WordBreakPro {
 // create a node of trie
    static class Node{
    Node child[] = new Node[26];
    boolean eow = false;
    public Node(){
      for(int i = 0; i<26; i++){
       child[i] = null;
       }
    }
 }
 static Node root = new Node();
// inserting a new node
static void insert(String word){//  O(L),L = length of word
 Node curr = root;
 for(int lev = 0; lev<word.length(); lev++){
    int idx = word.charAt(lev) - 'a';
    if(curr.child[idx] == null){
        curr.child[idx] = new Node();
    }
    curr = curr.child[idx];
  }
  curr.eow = true;
}
// search a given key word
static boolean search(String key){//  O(L),L = length of word
    Node curr = root;
    for(int lev = 0; lev<key.length(); lev++){
       int idx = key.charAt(lev) - 'a';
      if(curr.child[idx] == null){
         return false;
       }
       curr = curr.child[idx];
     }
     return curr.eow == true;
 }

 // problem's sol.
 static boolean wordBreak(String key){//O(L), l = length of key word
    if(key.length() == 0){// base case
        return true;
    }

    for(int i = 1; i<=key.length(); i++){
        if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
            return true;
        }
    }
 return false;
 }

 public static void main(String[] args) {
    String dic[] = {"i","like","sam","samsung","mobile","ice"};
    // create a trie
    for(String s : dic){
        insert(s);
     }
    String key = "ilikesung";
    boolean res = wordBreak(key);
    if(res){
        System.out.println(key + " is a word that exit in the dictionary");
    } else{
        System.out.println(key + " is a word that not exit in the dictionary");
    }
 }
}
