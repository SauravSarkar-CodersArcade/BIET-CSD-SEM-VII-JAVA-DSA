package dataStructures.nonLinear.trie;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd; // isEndOfWord;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a - z
    }
}
public class Trie {
    public static void insertWord(TrieNode root, String word){
        // aryan
        TrieNode curr = root;
        for (char ch : word.toCharArray()){ // -> {'a', 'r', 'y', 'a', 'n'}
            if(curr.children[ch - 'a'] == null){
                // The node with the given character doesn't exist
                // So, we will create the new node
                curr.children[ch-'a'] = new TrieNode();
            }
            // Move to the children for the next character
            curr = curr.children[ch-'a'];
        }
        curr.wordEnd = true; // This inserts the whole word into the trie
    }
    public static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char ch : word.toCharArray()){ // -> {'a', 'r', 'y', 'a', 'n'}
            if(curr.children[ch - 'a'] == null){
                // The node with the given character doesn't exist
                // So, the whole word doesn't exist
                return false;
            }
            // Move to the children for the next character
            curr = curr.children[ch-'a'];
        }
        return curr.wordEnd; // If exists true or else false
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.
                asList("ranjan", "avinash", "gowtam",
                        "mamatha", "shalini", "rida");
        for (String word : inputWords){
            insertWord(root, word);
        }
        List<String> searchWords = Arrays.
                asList("ranjan", "saurav", "avinash", "gowtam",
                        "mamatha", "nirmal", "shalini", "rida", "anup",
                        "samar");
        for (String word : searchWords){
            if(searchWord(root, word)){
                System.out.println(word + " is present in the Trie.");
            }else {
                System.out.println(word + " is not present in the Trie.");
            }
        }
    }
}
