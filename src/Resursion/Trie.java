/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashMap;

/**
 *
 * @author sidhsaho
 */
class TRNode {

    public TRNode(char ch) {
        value = ch;
        child = new HashMap<>();
        leaf = false;
    }
    boolean leaf;
    char value;
    HashMap<Character, TRNode> child;
}

public class Trie {

    TRNode root;

    public Trie() {
        root = new TRNode((char) 0);
    }

    public void insert(String word) {
        int len = word.length();
        TRNode temp = root;
        for (int i = 0; i < len; i++) {
            HashMap<Character, TRNode> children = temp.child;
            char ch = word.charAt(i);
            if (children.containsKey(ch)) {
                temp = children.get(ch);
            } else {
                TRNode t = new TRNode(ch);
                children.put(ch, t);
                temp = t;
            }
        }
        temp.leaf = true;
    }
    
    public boolean search(String word){
        int len=word.length();
        TRNode crawl=root;
        for(int i=0;i<len;i++){
            HashMap<Character, TRNode> children = crawl.child;
            char ch=word.charAt(i);
            if(children.containsKey(ch)){
                crawl=children.get(ch);
            }
            else{
                return false;
            }
        }
        if(crawl.leaf){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("are");
        t.insert("area");
        t.insert("base");
        t.insert("cat");
        t.insert("cater");
        t.insert("basement");
        t.insert("base");
        System.out.println(t.search("basem"));
    }
}
