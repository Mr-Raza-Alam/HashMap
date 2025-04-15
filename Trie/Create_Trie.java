package Trie;

import java.util.Scanner;
public class Create_Trie {
    // operation -1  creation of trie data structure by creating a trie Node which is capable to store 26 alphabetic charaters only
 static class Node{
     Node child[] = new Node[26];
     boolean eow = false;
     Node(){
        // here only we need initialize child array with null value so, we can insert value easily
      for(int i = 0; i<26; i++){
        child[i] = null;
      }
     }
 }
 // first we create a root Node that will always Empty
 static Node root = new Node();

 // operation-2 Insertion of data
 static void insert(String word){// O(L), L = length of longest word
    // first initialize a curr Node with root node
    Node curr = root;
    // Travese level-wise and check if there is any valid letter/node exit then leave it else create a new Node and insert the 1st letter of word
   for(int level = 0; level<word.length(); level++){
         int idx = word.charAt(level) -'a';
      if(curr.child[idx] == null){
        // i.e  empty cell ,can insert new letter of word
       curr.child[idx] = new Node();
      }
      // update curr
      curr = curr.child[idx];
   }
   // now the given word has ended so, eow = true
   curr.eow = true;
 } 
// operation-3 Searching of key word i.e given target word
static boolean search(String key){// O(L), L = length of longest word
    // first initialize a curr Node with root node
    Node curr = root;
    // Travese level-wise and check if there is any valid letter/node exit then leave it else create a new Node and insert the 1st letter of word
   for(int level = 0; level<key.length(); level++){
         int idx = key.charAt(level) -'a';
      if(curr.child[idx] == null){
        // if child[idx] = null means at idx , there is no such letter exit as given in the key word
         return false;
    }
      // update curr
      curr = curr.child[idx];
   }
   // now the given word has ended so, eow = true
   return curr.eow == true;
 } 

  public static void main(String[] args) {
   System.out.println("Welcome to Trie World!");
    String [] words = {"the","a","there","their","any","thee"};
    for(String i : words){
        insert(i);
    }
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter your target word = ");
   String target = sc.next();
   if(search(target)) System.out.println(target +" is exit in the trie");
   else System.out.println(target + " is not exit in the trie");
 }    
}
