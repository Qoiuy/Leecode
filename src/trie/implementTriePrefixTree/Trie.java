package trie.implementTriePrefixTree;

import java.util.HashMap;

public class Trie {

    public static void main(String[] args) {
        Trie obj = new Trie();
         obj.insert("word");
        System.out.println();
    }

    //用来存储子节点
    HashMap<Character, Trie> next;

    //用来存储当前节点使用次数
    Integer count ;

    /** Initialize your data structure here. */
    public Trie() {
        next  = new HashMap<>();
        count = 0;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        Trie tmp = this;

        for(int i = 0; i < word.length() ; i++){
            //
            char c = word.charAt(i);

            tmp = tmp.next.get(c);
            if(tmp == null){
                tmp = new Trie();
                tmp.next.put(c, new Trie());
                tmp.count ++;

            } else {
                tmp.count++;
            }



        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
return true;
    }
}
