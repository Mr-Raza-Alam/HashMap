package Trie;

public class LongestWord {
// find a word of longest length from the given dic[] and also all the prefix is also avialable in it
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
static String sb = "";
static void longest_Word(Node root,StringBuilder temp){
   if(root == null)   return;
   for(int i = 0; i<26; i++){
    if(root.child[i] != null && root.child[i].eow == true){
        temp.append((char)(i+'a'));
       if(temp.length() > sb.length()){
           sb = temp.toString();
       }
       // recursive call for next level
       longest_Word(root.child[i], temp);
       // After backtrack
       temp.deleteCharAt(temp.length() -1);
     } 
   }
}
public static void main(String[] args) {
    String dics[] = {"w","wo","wor","worl","world"};
    // build a TRIE
    for(String s : dics){
        insertNode(s);
    }
    longest_Word(root, new StringBuilder());
    System.out.println("Longest word :- "+sb);
}
}
